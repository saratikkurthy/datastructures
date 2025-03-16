package com.project.ds.numeric;

public class LongestPeak {
    public static int longetPeak(int[] nums){
        int longestPeak=0;
        int leftIndex=0;
        int rightIndex=0;
        for(int i=1;i<nums.length-1;i++)
        {
            int currentPeak=0;
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                leftIndex=i-2;
                rightIndex=i+2;
                while (leftIndex>=0 && nums[leftIndex]<nums[leftIndex+1]){
                    leftIndex--;
                }
                while (rightIndex<nums.length && nums[rightIndex]<nums[rightIndex-1]){
                    rightIndex++;
                }
                currentPeak = rightIndex-leftIndex-1;
                longestPeak=Math.max(longestPeak,currentPeak);
            }
        }

        return longestPeak;
    }
    public static void main(String... args){
        int[] nums={1,2,3,3,4,0,10,6,5,-1,-3,2,1,3,4};
        System.out.println(longetPeak(nums));
    }
}
