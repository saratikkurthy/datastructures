package com.project.matrix;

import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String... args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matrix multiplication:");
        System.out.println("Enter Rows of matrix1:");
        int rows1=scanner.nextInt();
        System.out.println("Enter Columns of Matrix1:");
        int cols1=scanner.nextInt();
        int[][] matrix1=new int[rows1][cols1];
        System.out.println("Enter elements of matrix1:");
        for(int i=0;i<rows1;i++){
            for (int j=0;j<cols1;j++) {
                System.out.println("Enter element for row:" + (i + 1) + " and col:" + (j + 1));
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Rows of matrix2:");
        int rows2=scanner.nextInt();
        System.out.println("Enter Columns of Matrix2:");
        int cols2=scanner.nextInt();
        int[][] matrix2=new int[rows2][cols2];
        System.out.println("Enter elements of matrix2:");
        for(int i=0;i<rows2;i++){
            for (int j=0;j<cols2;j++) {
                System.out.println("Enter element for row:" + (i + 1) + " and col:" + (j + 1));
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix1:");
        printMatrix(matrix1);
        System.out.println("Matrix2:");
        printMatrix(matrix2);
        System.out.println("Multiplication Matrix is:");
        printMatrix(multiplyMatrix(matrix1,matrix2));


    }

    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int[][] matrix1,int[][] matrix2){
        int rows1=matrix1.length;
        int cols1=matrix1[0].length;
        int cols2=matrix2[0].length;
        int[][] resultMatrix=new int[rows1][cols2];
        if(cols1!=matrix2.length){
            System.out.println("Matrix multiplication not possible for given matrices");
            System.exit(0);
        }
        else {
            for(int i=0;i<rows1;i++){
                for (int j=0;j<cols2;j++){
                    for(int k=0;k<cols1;k++){
                        resultMatrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                }
            }

        }
        return resultMatrix;
    }
}
