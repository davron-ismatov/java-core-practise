package org.example.javacoreandspringpractise.designPatterns.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new Factory();
        Shape shape = abstractFactory.getShape(new CircleFC());
        shape.draw();
        Shape shape1 = abstractFactory.getShape(new SquareFC());
        shape1.draw();
    }
}
