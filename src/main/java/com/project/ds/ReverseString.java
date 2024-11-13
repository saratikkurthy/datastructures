package com.project.ds;


import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            char tmp = input[left];
            input[left] = input[right];
            input[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] input = {'R', 'e', 'v', 'e', 'r', 's', 'e'};
        reverseString(input);
        System.out.println("Reverse :" + Arrays.toString(input));

    }
}
