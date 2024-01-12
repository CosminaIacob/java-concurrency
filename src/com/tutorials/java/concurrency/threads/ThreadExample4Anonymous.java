package com.tutorials.java.concurrency.threads;

public class ThreadExample4Anonymous {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousRunnable running.");
                System.out.println("AnonymousRunnable finished.");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
