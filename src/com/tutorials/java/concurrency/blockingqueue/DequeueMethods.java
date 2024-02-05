package com.tutorials.java.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class DequeueMethods {

    public static void main(String[] args) {

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        // blocks until an element becomes available
        try {
            String element = blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // returns null if no element is available
        String element2 = blockingQueue.poll();

        // blocks until timeout for an element to be available
        // if no element is available before that time, null is returned
        try {
            String element3 = blockingQueue.poll(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // removes the element if present in the queue
        // if there are multiple 1 elements, only the first one will be removed
        boolean wasRemoved = blockingQueue.remove("1");
    }
}
