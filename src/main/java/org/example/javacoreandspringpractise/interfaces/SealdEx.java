package org.example.javacoreandspringpractise.interfaces;

public sealed interface SealdEx permits Ex {

    static void method(){
        System.out.println("SealdEx method");
    }
}
