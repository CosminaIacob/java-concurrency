package com.tutorials.java.concurrency.threads;

public class ThreadExample2Thread {

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread running.");
            System.out.println("MyThread finished.");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
