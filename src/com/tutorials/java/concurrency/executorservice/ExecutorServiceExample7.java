package com.tutorials.java.concurrency.executorservice;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample7 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.shutdown();

        // returns the tasks that were not executed,
        // the task that were in the waiting queue when the shout down happened
        List<Runnable> runnables = executorService.shutdownNow();

        try {
            executorService.awaitTermination(3000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
