package com.baizhukui.sparrow.core;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * @author songxychina@gmail.com
 * @date 2023/10/08
 */
public class DataBaseTest {
    @Test
    public void testPut() throws Exception {
        try (DataBase db = new DataBase("default")) {
            db.open();

            db.put("name", "david".getBytes(StandardCharsets.UTF_8));
            String name = new String(db.get("name"), StandardCharsets.UTF_8);
            assertEquals("david", name);

//            db.put("name", "lucy".getBytes(StandardCharsets.UTF_8));
//            name = new String(db.get("name"), StandardCharsets.UTF_8);
//            assertEquals("david", name);
        }
    }

    @Test
    public void testDelete() throws Exception {
        try (DataBase db = new DataBase("default")) {
            db.open();
            db.put("name", "david".getBytes(StandardCharsets.UTF_8));
            String name = new String(db.get("name"), StandardCharsets.UTF_8);
            assertEquals("david", name);

            db.delete("name");
            assertNull(db.get("name"));
        }
    }

    @Test
    public void testCompact() throws Exception {
        try (DataBase db = new DataBase("default")) {
            db.open();

            db.put("name", "david".getBytes(StandardCharsets.UTF_8));
            db.put("name", "lucy".getBytes(StandardCharsets.UTF_8));

            db.compact();

            assertEquals("lucy", new String(db.get("name"), StandardCharsets.UTF_8));
        }
    }
}
