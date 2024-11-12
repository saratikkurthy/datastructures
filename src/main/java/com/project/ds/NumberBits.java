package com.project.ds;

public class NumberBits {
    public static int numBits(int num) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            if ((num & mask) != 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int num=256;
        System.out.println("Number of 1's in "+num +" is/are:"+(numBits(num)));
    }
}
