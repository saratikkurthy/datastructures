package com.project.ds.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeros(int[] array){
        int current=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[current]=array[i];
                current++;
            }
        }

        for (int i=current;i<array.length;i++){
            array[i]=0;
        }

    }
    public static void main(String... args){
        int[] nums={0,1,0,2,0,3,10,0,13};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
