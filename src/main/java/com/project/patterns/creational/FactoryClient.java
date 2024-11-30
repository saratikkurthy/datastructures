package com.project.patterns.creational;

import java.util.*;

public class FactoryClient {
    public static void main(String[] args){
        Shape shape=new CircleFactory().getShape();
        shape.draw();
        shape=new RectangleFactory().getShape();
        shape.draw();
        shape=new SquareFactory().getShape();
        shape.draw();

        List myList;
        myList=new ArrayList();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        System.out.println(myList);
        myList=new LinkedList();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        System.out.println(myList);
        myList=new Stack();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        System.out.println(myList);
        myList=new Vector();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        System.out.println(myList);

    }
}
