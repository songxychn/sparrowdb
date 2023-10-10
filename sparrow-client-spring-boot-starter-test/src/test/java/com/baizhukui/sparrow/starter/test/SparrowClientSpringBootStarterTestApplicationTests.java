package com.baizhukui.sparrow.starter.test;

import com.baizhukui.sparrow.starter.client.SparrowClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;


@SpringBootTest
class SparrowClientSpringBootStarterTestApplicationTests {
    @Autowired
    private SparrowClient sparrowClient;


    @Test
    void contextLoads() {
        sparrowClient.put("address", "beijing".getBytes(StandardCharsets.UTF_8));
        String address = new String(sparrowClient.get("address"), StandardCharsets.UTF_8);
        System.err.println(address);
        assertEquals("beijing", address);
    }

}
