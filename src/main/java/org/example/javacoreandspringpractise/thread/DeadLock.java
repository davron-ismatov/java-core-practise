package org.example.javacoreandspringpractise.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Lock lock = new ReentrantLock();

        Thread thread = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " started");
                if (lock.tryLock()){
                synchronized (lock2) {

                }
                System.out.println(Thread.currentThread().getName() + " end");

            }
            }
        }, "Thread-1");

        Lock lock3 = new ReentrantLock();
        Thread thread1 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " started");
                try {
                    if (lock.tryLock(3, TimeUnit.SECONDS)) {
                        synchronized (lock1) {

                        }
                        System.out.println(Thread.currentThread().getName() + " end");

                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread-2");

        thread.start();
        thread1.start();
    }
}
