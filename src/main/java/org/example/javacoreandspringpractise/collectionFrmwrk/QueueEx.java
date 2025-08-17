package org.example.javacoreandspringpractise.collectionFrmwrk;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueEx {
    static class Person implements Comparator<Person> {

        private String name;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        private int age;

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o2.age, o1.age);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        Queue<Person> queue = new PriorityQueue<>(new Person());
//
//
//        queue.offer(new Person("davron",1));
//        queue.offer(new Person("davron",2));
//        queue.offer(new Person("davron",3));
//
//        System.out.println(queue.poll().age);

        BlockingQueue<Integer> s  = new ArrayBlockingQueue<>(3);
        for (int i = 0; i < 10; i++) {
            s.offer(i);
        }
        

    }
}
