package com.baizhukui.sparrowdb.core;


import com.baizhukui.sparrowdb.core.entity.Index;
import com.baizhukui.sparrowdb.core.entity.Record;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/08
 */
@Slf4j
public class DataBase implements AutoCloseable {
    /**
     * 数据库名
     */
    @Getter
    private final String name;

    /**
     * 数据库对应目录
     */
    private final Path directory;

    /**
     * 为了防止多个进程同时使用一个目录, 加锁
     */
    private FileLock directoryLock;

    /**
     * 保存数据的磁盘文件, 对应 records.data
     */
    private RandomAccessFile dataFile;

    /**
     * 存在于内存的索引文件
     * key -> Index, 其中 Index 对象存有数据在文件中的偏移量和大小信息
     */
    private final Map<String, Index> indexes = new HashMap<>();

    public DataBase(String name) {
        this.name = name;
        this.directory = Path.of("./sparrowdb/" + name);
    }

    public synchronized void open() throws IOException {
        if (dataFile != null) {
            throw new IllegalStateException("该数据库已经处于 open 状态");
        }

        if (Files.notExists(directory)) {
            Files.createDirectories(directory);
        }

        // 给目录加锁
        RandomAccessFile lockFile = new RandomAccessFile(new File(directory.toFile(), "lockfile.lock"), "rw");
        FileChannel channel = lockFile.getChannel();
        directoryLock = channel.tryLock();
        if (directoryLock == null) {
            throw new IllegalStateException("该目录正在被其他进程使用");
        }

        Path dataPath = Path.of(directory.toString(), "records.data");
        dataFile = new RandomAccessFile(dataPath.toFile(), "rw");

        // 读取文件数据, 在内存中构建索引
        log.info("开始构建内存索引");
        dataFile.seek(0);
        while (true) {
            long offset = dataFile.getFilePointer();
            byte[] headerBytes = new byte[Record.HEADER_SIZE];
            int readCount = dataFile.read(headerBytes);
            if (readCount < 0) {
                // 读到了文件末尾
                break;
            }
            ByteBuf header = Unpooled.wrappedBuffer(headerBytes);
            int keySize = header.readInt();
            int valueSize = header.readInt();
            Record.Type type = Record.Type.getByValue(header.readByte());

            byte[] keyBytes = new byte[keySize];
            dataFile.read(keyBytes);
            String key = new String(keyBytes);

            Index index = new Index(key, offset, Record.HEADER_SIZE + keySize + valueSize);
            switch (type) {
                case PUT -> indexes.put(key, index);
                case DELETE -> indexes.remove(key);
            }

            // 无需读取 value, 直接跳过
            dataFile.skipBytes(valueSize);
        }
        log.info("内存索引构建完成");
    }

    @Override
    public void close() throws Exception {
        dataFile.close();
        indexes.clear();
        if (directoryLock != null) {
            directoryLock.release();
        }
    }

    public synchronized void put(String key, byte[] value) throws IOException {
        Record record = new Record(key, value, Record.Type.PUT);
        byte[] bytes = record.encode();

        // 追加至磁盘文件末尾
        long offset = dataFile.length();
        dataFile.seek(offset);
        dataFile.write(bytes);
        Index index = new Index(key, offset, bytes.length);
        // 更新索引
        indexes.put(key, index);
    }

    public synchronized byte[] get(String key) throws IOException {
        Index index = indexes.get(key);
        if (index == null) {
            // 该数据不存在或者已经被删除
            return null;
        }
        byte[] valueBytes = new byte[index.getValueSize()];

        dataFile.seek(index.getValueOffset());
        dataFile.read(valueBytes);
        return valueBytes;
    }

    public synchronized void delete(String key) throws IOException {
        Index index = indexes.get(key);
        if (index == null) {
            // 该数据不存在或者已经被删除
            return;
        }

        Record record = new Record(key, new byte[0], Record.Type.DELETE);
        byte[] bytes = record.encode();

        // 将删除记录追加至文件末尾
        long offset = dataFile.length();
        dataFile.seek(offset);
        dataFile.write(bytes);

        // 更新索引
        indexes.remove(key);
    }

    /**
     * 由于一直追加会导致文件体积膨胀, 本方法用于删除无效的记录, 以减小文件体积
     *
     * @throws IOException
     */
    public synchronized void compact() throws IOException {
        log.info("开始整理数据文件");

        // 创建新文件
        File compactFile = new File(directory.toFile(), "compact.data");
        if (compactFile.exists()) {
            compactFile.delete();
        }
        try (RandomAccessFile compactFileAccess = new RandomAccessFile(compactFile, "rw")) {
            compactFileAccess.seek(0);

            // 索引中的 key 都是有效数据
            for (Index index : indexes.values()) {
                long offset = compactFileAccess.getFilePointer();
                dataFile.seek(index.getOffset());
                byte[] bytes = new byte[index.getSize()];
                dataFile.read(bytes);
                Record record = Record.decode(bytes);

                // 写入新文件
                compactFileAccess.write(record.encode());

                // 更新索引
                index.setOffset(offset);
            }
        }

        // 删除旧文件
        dataFile.close();
        Files.delete(Path.of(directory.toString(), "records.data"));

        // 新文件改名
        File newFile = new File(directory.toFile(), "records.data");
        compactFile.renameTo(newFile);
        dataFile = new RandomAccessFile(newFile, "rw");

        log.info("数据文件整理完毕");
    }

}
