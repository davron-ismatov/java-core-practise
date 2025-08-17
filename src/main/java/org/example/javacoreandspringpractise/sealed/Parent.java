package org.example.javacoreandspringpractise.sealed;

public sealed class Parent permits Child1,Child2{
    public void display(){
        System.out.println("Parent");
    }
}
