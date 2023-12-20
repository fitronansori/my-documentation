package com.belajarthread;

public class SyncCounter {
    private Long value = 0L;

    public synchronized void increment() {
        value++;
    }

    public Long getValue() {
        return value;
    }
}
