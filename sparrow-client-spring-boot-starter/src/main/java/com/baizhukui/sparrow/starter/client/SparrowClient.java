package com.baizhukui.sparrow.starter.client;

import com.baizhukui.sparrow.api.SparrowApi;
import com.baizhukui.sparrow.api.SparrowServiceGrpc;
import com.baizhukui.sparrow.starter.config.SparrowClientConfig;
import com.google.protobuf.ByteString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/10
 */
@Component
public class SparrowClient {
    @Autowired
    private SparrowServiceGrpc.SparrowServiceBlockingStub stub;

    @Autowired
    private SparrowClientConfig sparrowClientConfig;

    public void put(String key, byte[] value) {
        SparrowApi.PutRequest request = SparrowApi.PutRequest.newBuilder()
                .setDbName(sparrowClientConfig.getDbName())
                .setKey(key)
                .setValue(ByteString.copyFrom(value))
                .build();
        SparrowApi.PutResponse response = stub.put(request);
        if (!response.getSuccess()) {
            throw new RuntimeException("写数据失败");
        }
    }

    public byte[] get(String key) {
        SparrowApi.GetRequest request = SparrowApi.GetRequest.newBuilder()
                .setDbName(sparrowClientConfig.getDbName())
                .setKey(key)
                .build();
        SparrowApi.GetResponse response = stub.get(request);
        if (!response.getSuccess()) {
            throw new RuntimeException("读数据失败");
        }
        if (!response.getExist()) {
            return null;
        }
        return response.getValue().toByteArray();
    }

    public void delete(String key) {
        SparrowApi.DeleteRequest request = SparrowApi.DeleteRequest.newBuilder()
                .setDbName(sparrowClientConfig.getDbName())
                .setKey(key)
                .build();
        SparrowApi.DeleteResponse response = stub.delete(request);
        if (!response.getSuccess()) {
            throw new RuntimeException("删除数据失败");
        }
    }

}
