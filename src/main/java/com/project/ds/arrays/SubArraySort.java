package com.project.ds.arrays;

public class SubArraySort {
    public int findUnsortedSubArray(int[] nums){
        int firstIndex=0;
        int length=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                if(firstIndex==0){
                    firstIndex=i;
                }
                else {
                    length=i;
                }
            }
        }

        return length-firstIndex+1;
    }

    public static void main(String... args){
        SubArraySort obj=new SubArraySort();
        int[] nums={1,2,4,7,10,11,7,12,6,7,16,18,19};
        System.out.println("Length of unsorted Sub Array is:"+obj.findUnsortedSubArray(nums));
    }
}
