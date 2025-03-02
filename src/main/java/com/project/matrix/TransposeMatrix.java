package com.project.matrix;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String... args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Matrix Row size:");
        int rows=scanner.nextInt();
        System.out.println("Enter Matrix Columns size:");
        int cols=scanner.nextInt();
        int[][] inputMatrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("Enter element for row:"+(i+1)+" and column:"+(j+1));
                inputMatrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Input Matrix:");
        printMatrix(inputMatrix);
        System.out.println("Transpose Matrix:");
        printMatrix(transpose(inputMatrix));
    }
    public static void printMatrix(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int[] elements:matrix){
            for (int data:elements){
               System.out.print(data+" ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] transpose(int[][] matrix){
        int[][] tranpose=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                tranpose[i][j]=matrix[j][i];
            }
        }
        return tranpose;
    }
}
