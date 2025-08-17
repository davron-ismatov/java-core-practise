package org.example.javacoreandspringpractise.designPatterns.abstractFactory;

public class CircleFC implements ShapeAbstractFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
