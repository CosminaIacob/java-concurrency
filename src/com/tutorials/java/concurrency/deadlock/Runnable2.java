package com.tutorials.java.concurrency.deadlock;

import java.util.concurrent.locks.Lock;

public class Runnable2 implements Runnable {

    private Lock lock1 = null;
    private Lock lock2 = null;

    public Runnable2(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName+" attempting to lock Lock 2");
        lock2.lock();
        System.out.println(threadName+ " locked Lock 2");

        try {
            // to deliberately force out the deadlock
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // ignore
        }

        System.out.println(threadName + " attempting to lock Lock 1");
        lock1.lock();
        System.out.println(threadName + " locked Lock 1");

        // do the work

        //unlock
        System.out.println(threadName+" unlocking Lock 1");
        lock1.unlock();

        System.out.println(threadName+" unlocking Lock 2");
        lock2.unlock();

    }
}
