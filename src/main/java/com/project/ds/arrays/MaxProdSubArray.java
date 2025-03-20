package com.project.ds.arrays;

public class MaxProdSubArray {
    public static int maxProd(int[] nums){
        int min=1;
        int max=1;
        int result=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                min=1;
                max=1;
                result = Math.max(result,nums[i]);
            }
            int tmp=min;
            min = Math.min(nums[i],Math.min(nums[i]*min,nums[i]*max));
            max = Math.max(nums[i],Math.max(nums[i]*tmp,nums[i]*max));
            result = Math.max(result,max);
        }

        return result;
    }
    public static void main(String... args){
        int[] nums={1,-2,0,4,5};
        System.out.println("Max Product Sub array:"+maxProd(nums));
    }
}
