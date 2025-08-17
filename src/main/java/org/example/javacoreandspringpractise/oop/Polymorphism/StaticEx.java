package org.example.javacoreandspringpractise.oop.Polymorphism;

public  class StaticEx {
    public volatile static String a = "";
    static class A{

        public static void method(){
            System.out.println("A");
        }

        public void print(){
            System.out.println("A");
        }
    }

    static class B extends A{
        public static void method(){
            System.out.println("B");
        }

        public void print(){
            System.out.println("B");
        }

        public void o(){}
    }

    private static void p(){}

    public static void main(String[] args) throws InterruptedException {
       Thread thread = new Thread(()->{
           for (int i = 0; i < 2000; i++) {
               a+="a";
           }
       });
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 2000; i++) {
                a+="a";
            }
        });
       thread.start();
       thread1.start();
       thread.join();
       thread1.join();
        System.out.println(a.length());
    }
}
