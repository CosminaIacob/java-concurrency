package com.tutorials.java.concurrency.executorservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample1_1 {

    public static void main(String[] args) {

        int corePoolSize = 10;
        int maxPoolSize = 20;
        long keepAliveTime = 3000;

        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(128));
        threadPoolExecutor = Executors.newFixedThreadPool(3);

        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(corePoolSize);
        scheduledExecutorService = Executors.newScheduledThreadPool(10);
    }
}
