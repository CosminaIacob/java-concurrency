package com.tutorials.java.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AdditionalMethods {

    public static void main(String[] args) {

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        int size = blockingQueue.size();

        // returns the number of elements that the queue has still space to store
        int capacity = blockingQueue.remainingCapacity();

        boolean containsElement = blockingQueue.contains("1");
    }
}
