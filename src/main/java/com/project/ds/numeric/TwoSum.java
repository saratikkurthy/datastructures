package com.project.ds.numeric;

import java.util.Arrays;

public class TwoSum {
    public static void main(String... args){
        int[] input={3,4,1,0,11,5,6,-1,-4,2};
        int[] result=doubleSum(input,10);
        System.out.println("Sum for 10 found in combination of "+Arrays.toString(result));

    }
    public static int[] doubleSum(int[] nums,int sum){
        int[] result= new int[2];
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[left]+nums[right]==sum){
                result[0]=nums[left];
                result[1]=nums[right];
            }
            else if(nums[left]+nums[right]>sum){
                right--;
            }
            else if(nums[left]+nums[right]<sum)
            {
                left++;
            }
        }

        return result;
    }
}
