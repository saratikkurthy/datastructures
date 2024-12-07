package com.project.ds.trees;

class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class BinTree {
    public static void main(String[] args) {
        // Initialize and allocate memory for tree nodes
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        // Connect binary tree nodes
        System.out.println("Root.left:"+root.left.data);
        System.out.println("Root.right:"+root.right.data);

    }
}