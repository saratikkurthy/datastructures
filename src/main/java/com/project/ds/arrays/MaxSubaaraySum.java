package com.project.ds.arrays;

public class MaxSubaaraySum {
    public int maxSubArray(int[] nums){
        int sum=0;
        int max=nums[0];
        int currentSum=nums[0];;
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            max=Math.max(max,currentSum);
        }

        return max;
    }

    public static void main(String... args){
        MaxSubaaraySum obj=new MaxSubaaraySum();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max subarray sum is:"+obj.maxSubArray(nums));
    }
}
