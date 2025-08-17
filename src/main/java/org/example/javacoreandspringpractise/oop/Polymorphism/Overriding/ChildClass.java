package org.example.javacoreandspringpractise.oop.Polymorphism.Overriding;

import org.example.javacoreandspringpractise.oop.Polymorphism.Overloading.ParentClas;

import java.util.ArrayList;
import java.util.Random;

public  class ChildClass extends ParentClas implements Runnable{


    public final Double power(Integer i){
        return new Random().nextDouble();
    }

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}
