package com.project.patterns.creational;

public interface Shape {
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("This is Rectangle");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("This is Square");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("This is Circle");
    }
}