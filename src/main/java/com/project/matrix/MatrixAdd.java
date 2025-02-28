package com.project.matrix;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String args[]){
        int rows,cols;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        rows=scanner.nextInt();
        System.out.println("Enter number of columns:");
        cols=scanner.nextInt();
        int[][] inputMatrix1=new int[rows][cols];
        int[][] inputMatrix2=new int[rows][cols];
        System.out.println("Enter Matrix1 Elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element for row:"+(i+1)+" and Column:"+(j+1));
                inputMatrix1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter Matrix2 Elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element for row:"+(i+1)+" and Column:"+(j+1));
                inputMatrix2[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Matrix1:");
        printMatrix(inputMatrix1);
        System.out.println("Matrix2:");
        printMatrix(inputMatrix2);
        System.out.println("Addition Matrix:");
        int[][] result=addMatrix(inputMatrix1,inputMatrix2);
        printMatrix(result);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static int[][] addMatrix(int[][] matrix1,int[][] matrix2){
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] returnMatrix=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                returnMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return returnMatrix;

    }
}
