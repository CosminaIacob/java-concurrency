package com.tutorials.java.concurrency.memory;

public class SharedObjects {

    public static void main(String[] args) {

//        MyObject myObject = new MyObject();
//        Runnable runnable = new MyRunnable(my1Object);

        Runnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
