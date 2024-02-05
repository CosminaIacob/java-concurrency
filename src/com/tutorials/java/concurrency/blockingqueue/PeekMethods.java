package com.tutorials.java.concurrency.blockingqueue;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PeekMethods {

    public static void main(String[] args) {

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        // returns the first element of the queue without removing  it
        // if there are no element in the queue, returns null
        String element1 = blockingQueue.peek();


        // returns the first element of the queue without removing  it
        // if there are no element in the queue, throws NoSuchElementException
        try {
            String element2 = blockingQueue.element();
        } catch (NoSuchElementException e) {
            System.out.println("BlockingQueue is empty");
        }
    }
}
