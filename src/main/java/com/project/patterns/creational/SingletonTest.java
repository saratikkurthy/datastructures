package com.project.patterns.creational;

public class SingletonTest {
    private static class Holder{
        static final SingletonTest INSTANCE = new SingletonTest();
    }
    public static SingletonTest getInstance(){
        System.out.println("Creating Instance");
        return Holder.INSTANCE;
    }
    public static void main(String... args){
        SingletonTest obj=SingletonTest.getInstance();
        obj=SingletonTest.getInstance();
        SingletonTest obj2=SingletonTest.getInstance();
        SingletonTest obj3=new SingletonTest();
    }
}
