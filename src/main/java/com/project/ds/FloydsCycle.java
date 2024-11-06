package com.project.ds;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }
}

public class FloydsCycle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Create cycle

        if (Node.hasCycle(node1)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
        int[] arr = {2, 3, 4, 1, 5, 3, 7};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    /**
     * @param arr
     * @return
     */
    static int findDuplicate(int[] arr) {
        int hare = 0, tortoise = 0;
        do {
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        } while (tortoise != hare);
        tortoise = 0;
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        return tortoise;
    }
}
