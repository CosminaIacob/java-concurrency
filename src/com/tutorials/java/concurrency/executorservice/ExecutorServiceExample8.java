package com.tutorials.java.concurrency.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample8 {

    // how to cancel a task that is in thread pool waiting queue but has not been yet executed
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future future = executorService.submit(newCallable("Task 1.1"));

        System.out.println(future.isDone());

        // if a task is already executing, cannot be interrupted/cancelled
        boolean mayInterrupt = false;
        boolean wasCancelled = future.cancel(mayInterrupt);
        System.out.println(wasCancelled);

        try {
            String result = (String) future.get();
            System.out.println(result);
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {

        } catch (CancellationException e) {
            String msg = "Cannot call Future.get() since the task was cancelled";
            System.out.println(msg);
        }

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());

        executorService.shutdown();
    }

    private static Callable newCallable(String msg) {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String completeMsg = Thread.currentThread().getName() + ": " + msg;
                return completeMsg;
            }
        };
    }
}
