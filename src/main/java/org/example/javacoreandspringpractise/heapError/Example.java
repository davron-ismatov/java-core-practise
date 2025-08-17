package org.example.javacoreandspringpractise.heapError;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public  static   List<Double> k = new ArrayList<>();

    public void populate(){
        for (int i = 0; i < 100000000; i++) {
            k.add(Math.random());
        }
        System.out.println("created");

    }

    public static void main(String[] args) {
        new Example().populate();
    }
}
