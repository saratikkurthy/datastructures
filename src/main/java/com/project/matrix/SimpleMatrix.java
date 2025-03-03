package com.project.matrix;

import java.util.Scanner;

public class SimpleMatrix {
    public static void main(String... args){
        int rows,cols;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        rows=scanner.nextInt();
        System.out.println("Enter number of columns:");
        cols=scanner.nextInt();
        int[][] inputMatrix=new int[rows][cols];
        System.out.println("Enter Matrix Elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element for row:"+(i+1)+" and Column:"+(j+1));
                inputMatrix[i][j]=scanner.nextInt();
            }
        }
        printMatrix(inputMatrix);

    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
