package com.baizhukui.sparrow.starter.config;

import com.baizhukui.sparrow.api.SparrowServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/10
 */
@Configuration
@ConfigurationProperties(prefix = "spring.data.sparrow")
@Setter
@Getter
public class SparrowClientConfig {
    private String host;

    private int port;

    private String dbName;

    @Bean
    public SparrowServiceGrpc.SparrowServiceBlockingStub sparrowServiceGrpc() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        return SparrowServiceGrpc.newBlockingStub(channel);
    }
}
