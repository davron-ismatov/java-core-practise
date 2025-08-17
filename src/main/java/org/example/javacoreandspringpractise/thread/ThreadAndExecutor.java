package org.example.javacoreandspringpractise.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public  class ThreadAndExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executors = Executors.newCachedThreadPool();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("afd");
            }
        };
        Thread thread = new Thread(runnable);

        thread.start();
        thread.join();
    }

}
