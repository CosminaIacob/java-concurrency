package com.tutorials.java.concurrency.raceconditions;

public class Counter {

    private long count = 0;

    public long incAndGet() {
        this.count++;
        return this.count;
    }

    public long get() {
        return this.count;
    }
}
