package com.baizhukui.sparrowdb.service;

import com.baizhukui.sparrowdb.api.SparrowApi;
import com.baizhukui.sparrowdb.api.SparrowServiceGrpc;
import com.baizhukui.sparrowdb.core.DataBase;
import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/10
 */
@Slf4j
public class SparrowServiceImpl extends SparrowServiceGrpc.SparrowServiceImplBase {
    private final ConcurrentMap<String, DataBase> dbMap = new ConcurrentHashMap<>();

    @Override
    public void put(SparrowApi.PutRequest request, StreamObserver<SparrowApi.PutResponse> responseObserver) {
        SparrowApi.PutResponse response = null;
        String dbName = request.getDbName();
        try {
            ensureOpen(dbName);
            DataBase db = dbMap.get(dbName);
            db.put(request.getKey(), request.getValue().toByteArray());
            response = SparrowApi.PutResponse.newBuilder()
                    .setSuccess(true)
                    .setMsg("成功")
                    .build();
        } catch (Exception e) {
            log.error("写数据失败", e);
            response = SparrowApi.PutResponse.newBuilder()
                    .setSuccess(false)
                    .setMsg("异常")
                    .build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void get(SparrowApi.GetRequest request, StreamObserver<SparrowApi.GetResponse> responseObserver) {
        SparrowApi.GetResponse response = null;
        String dbName = request.getDbName();
        try {
            ensureOpen(dbName);
            DataBase db = dbMap.get(dbName);
            byte[] value = db.get(request.getKey());
            response = SparrowApi.GetResponse.newBuilder()
                    .setSuccess(true)
                    .setMsg("成功")
                    .setExist(value != null)
                    .setValue(value == null ? ByteString.EMPTY : ByteString.copyFrom(value))
                    .build();
        } catch (Exception e) {
            log.error("读数据失败", e);
            response = SparrowApi.GetResponse.newBuilder()
                    .setSuccess(false)
                    .setMsg("异常")
                    .build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(SparrowApi.DeleteRequest request, StreamObserver<SparrowApi.DeleteResponse> responseObserver) {
        SparrowApi.DeleteResponse response = null;
        String dbName = request.getDbName();
        try {
            ensureOpen(dbName);
            DataBase db = dbMap.get(dbName);
            db.delete(request.getKey());
            response = SparrowApi.DeleteResponse.newBuilder()
                    .setSuccess(true)
                    .setMsg("成功")
                    .build();
        } catch (Exception e) {
            log.error("删除数据失败", e);
            response = SparrowApi.DeleteResponse.newBuilder()
                    .setSuccess(false)
                    .setMsg("异常")
                    .build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void ensureOpen(String dbName) throws IOException {
        dbMap.putIfAbsent(dbName, new DataBase(dbName));
        DataBase db = dbMap.get(dbName);
        if (db.getStatus() == DataBase.Status.CLOSED) {
            db.open();
        }
    }
}
