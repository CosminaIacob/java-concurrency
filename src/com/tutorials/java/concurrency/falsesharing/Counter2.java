package com.tutorials.java.concurrency.falsesharing;

public class Counter2 {

    // this tells the JVM that this field must not be stored within the same cache line
    // as other fields within the same class
    @jdk.internal.vm.annotation.Contended
    public volatile long count1 = 0;

    public volatile long count2 = 0;
}
