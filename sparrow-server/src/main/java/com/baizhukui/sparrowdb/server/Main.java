package com.baizhukui.sparrowdb.server;

import com.baizhukui.sparrowdb.service.SparrowServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/10
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(6666)
                .addService(new SparrowServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
