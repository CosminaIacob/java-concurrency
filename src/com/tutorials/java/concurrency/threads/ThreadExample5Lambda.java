package com.tutorials.java.concurrency.threads;

public class ThreadExample5Lambda {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("LambdaRunnable running.");
            System.out.println("LambdaRunnable finished.");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
