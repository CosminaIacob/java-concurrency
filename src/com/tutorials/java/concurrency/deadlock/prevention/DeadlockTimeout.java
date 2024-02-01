package com.tutorials.java.concurrency.deadlock.prevention;

import com.tutorials.java.concurrency.deadlock.Runnable1;
import com.tutorials.java.concurrency.deadlock.Runnable2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockTimeout {

    public static void main(String[] args) {

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Runnable runnable1 = new Runnable1TimeOut(lock1, lock2);
        Runnable runnable2 = new Runnable2TimeOut(lock1, lock2);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
