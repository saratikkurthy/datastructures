package com.project.ds.arrays;

public class MinRotatedSortArray {
    public static int minRotated(int[] nums){
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.min(nums[0],nums[1]);
        }
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid = left + (right - left)/2;
            if (nums[mid] > nums[mid+1]) return nums[mid+1];
            if (nums[mid] < nums[mid-1]) return  nums[mid];
            if(nums[left] < nums[mid])
                left=mid+1;
            else
                right = mid-1;

        }
        return 0;
    }

    public static void main(String... args){
        int[] nums= {6,7,8,9,10,11,2,3,4,5};
        System.out.println(minRotated(nums));
    }
}
