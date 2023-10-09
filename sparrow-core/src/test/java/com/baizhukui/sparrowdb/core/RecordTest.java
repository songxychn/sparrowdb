package com.baizhukui.sparrowdb.core;

import com.baizhukui.sparrowdb.core.entity.Record;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/07
 */
@Slf4j
public class RecordTest {
    @Test
    public void testEncodeAndDecode() {
        Record record = new Record("name", "jack".getBytes(StandardCharsets.UTF_8), Record.Type.PUT);
        byte[] bytes = record.encode();
        System.err.println(Arrays.toString(bytes));
        Record decoded = Record.decode(bytes);
        System.err.println(decoded);
        assertEquals("name", decoded.getKey());
        assertEquals("jack", new String(decoded.getValue()));
    }

}
