package com.project.ds.queue;

public class MyQueue {
    private Node front;
    private Node rear;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public MyQueue(int value) {
        front = new Node(value);
        rear = front;
        length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
            rear = newNode;
            length = 1;
        } else {

            rear.next = newNode;
            rear = newNode;
            length++;
        }
    }

    public Node dequeue() {
        Node tempNode = front;
        if (length == 0) return null;
        if (length == 1) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            tempNode.next = null;
        }
        length--;
        return tempNode;

    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Empty Queue, nothing to print.");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        MyQueue item = new MyQueue(1);
        item.enqueue(2);
        item.enqueue(3);
        item.printQueue();
        item.dequeue();
        item.printQueue();

    }

}
