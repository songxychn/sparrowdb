package com.baizhukui.sparrowdb.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.charset.StandardCharsets;

/**
 * @author songxychina@gmail.com
 * @date 2023/10/08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Index {
    private String key;

    private long offset;

    private int size;

    public long getKeyOffset() {
        return offset + Record.HEADER_SIZE;
    }

    public long getValueOffset() {
        return getKeyOffset() + getKeySize();
    }

    public int getKeySize() {
        return key.getBytes(StandardCharsets.UTF_8).length;
    }

    public int getValueSize() {
        return size - Record.HEADER_SIZE - getKeySize();
    }
}
