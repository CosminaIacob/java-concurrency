package com.tutorials.java.concurrency.falsesharing;

// tells the JVM that none of the fields from this class
// can be stored within the same cache line
@jdk.internal.vm.annotation.Contended
public class Counter3 {

    public volatile long count1 = 0;

    public volatile long count2 = 0;

    public volatile long count3 = 0;
}
