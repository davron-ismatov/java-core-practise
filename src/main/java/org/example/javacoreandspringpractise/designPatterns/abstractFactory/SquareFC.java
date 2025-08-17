package org.example.javacoreandspringpractise.designPatterns.abstractFactory;

public class SquareFC implements ShapeAbstractFactory{
    @Override
    public Shape getShape() {
        return new Square();
    }
}
