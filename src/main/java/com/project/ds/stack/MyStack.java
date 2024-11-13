package com.project.ds.stack;

public class MyStack {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
        }

    }

    public MyStack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public int getTop() {
        return top.value;
    }

    public int getHeight() {
        return height;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        if (height == 0) {
            top = newNode;
            height = 1;
        } else {
            newNode.next = top;
            top = newNode;
            height++;
        }
    }

    public int pop() {
        if (height == 0) {
            return -1;
        } else {
            Node deleteNode = top.next;
            int val = top.value;
            top = deleteNode;
            height--;
            return val;
        }

    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(6);
        stack.push(7);
        stack.printStack();
        System.out.println("Height:" + stack.getHeight());
        int popValue = stack.pop();
        if (popValue >= 0) {
            System.out.println("Deleted:" + popValue);
        } else {
            System.out.println("Empty Stack. Nothing to pop");
        }
        stack.printStack();
    }

}
