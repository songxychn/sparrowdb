package com.baizhukui.sparrowdb.core.entity;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.charset.StandardCharsets;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    public static final int HEADER_SIZE = 4 + 4 + 1;

    private String key;

    private byte[] value;

    private Type type;

    public byte[] encode() {
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer(HEADER_SIZE + keyBytes.length + value.length);
        buffer.writeInt(keyBytes.length);
        buffer.writeInt(value.length);
        buffer.writeByte(type.value);
        buffer.writeBytes(keyBytes);
        buffer.writeBytes(value);
        byte[] res = new byte[buffer.readableBytes()];
        buffer.readBytes(res);
        return res;
    }

    public static Record decode(byte[] bytes) {
        Record record = new Record();
        ByteBuf buffer = Unpooled.wrappedBuffer(bytes);

        int keySize = buffer.readInt();
        int valueSize = buffer.readInt();
        record.type = Type.getByValue(buffer.readByte());

        byte[] keyBytes = new byte[keySize];
        buffer.readBytes(keyBytes);
        record.key = new String(keyBytes);

        byte[] valueBytes = new byte[valueSize];
        buffer.readBytes(valueBytes);
        record.value = valueBytes;

        return record;
    }

    @AllArgsConstructor
    public enum Type {
        PUT((byte) 0),
        DELETE((byte) 1);

        public final byte value;

        public static Type getByValue(byte value) {
            for (Type type : Type.values()) {
                if (type.value == value) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Invalid Type value: " + value);
        }
    }
}
