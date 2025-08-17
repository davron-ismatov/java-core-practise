package org.example.javacoreandspringpractise.designPatterns.abstractFactory;

public class Factory implements AbstractFactory{
    @Override
    public Shape getShape(ShapeAbstractFactory shapeAbstractFactory) {
        return shapeAbstractFactory.getShape();
    }
}
