package com.tutorials.java.concurrency.synchronize;

public class MixedSynchronization {

    public static Object staticObj = null;

    public static synchronized void setStaticObj(Object obj) {
        staticObj = obj;
    }

    public Object instanceObj = null;

    public synchronized void setInstanceObj(Object obj) {
        this.instanceObj = obj;
    }
}
