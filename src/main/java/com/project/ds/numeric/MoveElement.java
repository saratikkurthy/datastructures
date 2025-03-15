package com.project.ds.numeric;

import java.util.Arrays;

public class MoveElement {
    public static void moveElement(int[] input,int element){
        int left=0;
        int right=input.length-1;
        int elementPos=0;
        for(int i=0;i<input.length;i++){
            if(input[left]==element && left<right){
                if(input[right]!=element){
                    input[left]=input[right];
                    input[right] = element;
                    left++;
                }
            }
            if(input[right]==element){
                right--;
            }
            if(input[left]!=element){
                left++;
            }

        }
    }

    public static void main(String... args){
        int[] nums={8,2,1,2,2,2,3,4,2,2,5,2,1,2,6,7,2};
        moveElement(nums,2);
        System.out.println(Arrays.toString(nums));
    }
}
