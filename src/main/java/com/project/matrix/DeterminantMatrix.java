package com.project.matrix;

import java.util.Scanner;

public class DeterminantMatrix {
    public static void main(String... args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter rows for matrix:");
        int rows=scanner.nextInt();
        System.out.println("Enter cols for matrix");
        int cols=scanner.nextInt();
        if(rows!=cols){
            System.out.println("Determinant not possible for non square matrix. Exiting.");
            System.exit(0);
        }
        int[][] matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("Enter element for row:"+(i+1)+" and col:"+(j+1));
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Entered Matrix is:");
        printMatrix(matrix);
        System.out.println("Calculating Determinant:");
        int det=determinant(matrix);
        System.out.println("Determinant of matrix is:"+det);

    }
    public static int determinant(int[][] matrix){
        int result=0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return matrix[0][0];
        }
        else if(rows==2){
            return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        }
        else{
            for(int i=0;i<rows;i++){
                int[][] subMatrix=new int[rows-1][rows-1];
                for(int j=1;j<rows;j++){
                    for(int k=0;k<rows;k++){
                        if(k<i){
                            subMatrix[j-1][k]=matrix[j][k];
                        }
                        else if(k>i){
                            subMatrix[j-1][k-1]=matrix[j][k];
                        }
                    }
                }
                result+= matrix[0][i]*Math.pow(-1,i)*determinant(subMatrix);
            }

        }

        return result;
    }
    public static void printMatrix(int[][] matrix){
        for(int[] row:matrix){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
