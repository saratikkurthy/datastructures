package com.project.ds;

public class SingleNumberExtract {
    public static int findSingle(int[] nums){
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;

    }
    public static void main(String[] args){
        int[] nums={6,3,1,2,6,4,2,5,4,3,1};
        System.out.println(findSingle(nums));
    }
}
