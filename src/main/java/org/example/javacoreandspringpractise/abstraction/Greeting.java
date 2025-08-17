package org.example.javacoreandspringpractise.abstraction;

public abstract class Greeting implements First{
    private String name;
    public Greeting(String name) {
        this.name = name;
    }

    @Override
    public void hello() {

    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting("AD") {
            @Override
            public void hi() {

            }
        };
        greeting.hello();
    }
}
