package com.project.patterns.creational;

public class FactoryClient {
    public static void main(String[] args){
        Shape shape=new CircleFactory().getShape();
        shape.draw();
        shape=new RectangleFactory().getShape();
        shape.draw();
        shape=new SquareFactory().getShape();
        shape.draw();
    }
}
