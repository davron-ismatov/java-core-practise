package org.example.javacoreandspringpractise.thread;

public class DeamonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            System.out.println("Deamon Thread running");
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t.setDaemon(true);
        t.start();
        t.join();
        System.out.println("Main thread ends");
    }
}
