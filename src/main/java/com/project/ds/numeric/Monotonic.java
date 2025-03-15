package com.project.ds.numeric;

public class Monotonic {
    public static boolean isMonotonic(int nums[]){
        boolean isIncreasing=true;
        boolean isDecreasing=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                isDecreasing=false;
            }
            if(nums[i]>nums[i+1]){
                isIncreasing=false;
            }
        }
        return isDecreasing || isIncreasing;
    }

    public static void main(String... args){
        int[] nums={1,1,1,2,3,4,8,3};
        System.out.println(isMonotonic(nums));
    }
}
