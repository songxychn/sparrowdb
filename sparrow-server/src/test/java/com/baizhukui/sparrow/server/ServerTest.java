package com.baizhukui.sparrow.server;

import com.baizhukui.sparrow.api.SparrowApi;
import com.baizhukui.sparrow.api.SparrowServiceGrpc;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/10
 */
public class ServerTest {
    private static SparrowServiceGrpc.SparrowServiceBlockingStub service;

    @BeforeClass
    public static void beforeClass() throws Exception {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext().build();
        service = SparrowServiceGrpc.newBlockingStub(channel);
    }

    @Test
    public void testPut() {
        SparrowApi.PutRequest request = SparrowApi.PutRequest.newBuilder()
                .setDbName("default")
                .setKey("name")
                .setValue(ByteString.copyFrom("lucy".getBytes(StandardCharsets.UTF_8)))
                .build();
        SparrowApi.PutResponse response = service.put(request);
        System.err.println(response);
        assertTrue(response.getSuccess());
    }

    @Test
    public void testGet() {
        SparrowApi.GetRequest request = SparrowApi.GetRequest.newBuilder()
                .setDbName("default")
                .setKey("name")
                .build();
        SparrowApi.GetResponse response = service.get(request);
        System.err.println(response);
        assertTrue(response.getSuccess());
        assertEquals("lucy", new String(response.getValue().toByteArray()));
    }

    @Test
    public void testDelete() {
        SparrowApi.DeleteRequest deleteRequest = SparrowApi.DeleteRequest.newBuilder()
                .setDbName("default")
                .setKey("name")
                .build();
        SparrowApi.DeleteResponse deleteResponse = service.delete(deleteRequest);
        System.err.println(deleteResponse);

        SparrowApi.GetRequest getRequest = SparrowApi.GetRequest.newBuilder()
                .setDbName("default")
                .setKey("name")
                .build();
        SparrowApi.GetResponse response = service.get(getRequest);
        System.err.println(response);
        assertTrue(response.getSuccess());
        assertFalse(response.getExist());
    }
}
