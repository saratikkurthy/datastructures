package com.project.ds.numeric;

import java.util.Arrays;

public class SpiralTraversal {
    public static int[] spiralTraverse(int[][] matrix){
        int[] result=new int[matrix.length * matrix[0].length];
        // Initialize boundaries
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int index=0;

        // Iterate until all elements are printed
        while (top <= bottom && left <= right) {

            // Print top row from left to right
            for (int i = left; i <= right; ++i) {
                result[index++]=matrix[top][i];
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; ++i) {
                result[index++]=matrix[i][right];
            }
            right--;

            // Print bottom row from right to left (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    result[index++]=matrix[bottom][i];
                }
                bottom--;
            }

            // Print left column from bottom to top (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    result[index++]=matrix[i][left];
                }
                left++;
            }
        }


        return result;
    }

    public static void main(String... args){
        int[][] input={{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(Arrays.toString(spiralTraverse(input)));
    }
}
