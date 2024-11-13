package com.project.ds.linkedlist;

public class MyLinkedList {
    Node head = null;
    Node tail = null;
    int length = 0;

    class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    /**
     * @param value
     */

    public MyLinkedList(int value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    /**
     * @param value
     */
    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    /**
     * @return
     */

    public int getHead() {
        return head.value;
    }

    /**
     *
     */
    public void printList() {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            while (current.next != null) {
                System.out.print(current.value + "->");
                current = current.next;
            }
            System.out.print(current.value);
        }
    }

    /**
     * @return
     */

    public  Node removeLast() {
        if (length == 0)
            return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        return tail;
    }

    /**
     * @param args
     */

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(5);
        list.insert(6);
        list.insert(4);
        list.insert(7);
        list.insert(9);
        list.insert(3);
        list.printList();
        System.out.println();
        System.out.println("Length of Linked List:" + list.length);
        System.out.println("First element of Linked List:" + list.head.value);
        System.out.println("Last element of Linked List:" + list.tail.value);
        System.out.println("Last element of Linked List is:"+list.removeLast().value);
        list.printList();
    }
}
