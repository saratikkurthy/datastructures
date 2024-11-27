package com.project.patterns.creational;

public abstract class ShapeFactory {
    protected abstract Shape factoryMethod();
    public Shape getShape(){
        return factoryMethod();
    }
}


class RectangleFactory extends ShapeFactory{
    public Shape factoryMethod(){
        return new Rectangle();
    }
}

class CircleFactory extends ShapeFactory{
    public Shape factoryMethod(){
        return new Circle();
    }
}

class SquareFactory extends ShapeFactory{
    public Shape factoryMethod(){
        return new Square();
    }
}
