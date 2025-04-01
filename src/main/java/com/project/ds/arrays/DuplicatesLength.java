package com.project.ds.arrays;

public class DuplicatesLength {
    public static int duplicatesLength(int[] nums){
        int length=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[length]!=nums[i])
                length++;
            nums[length]=nums[i];
        }

        return length+1;
    }

    public static void main(String... args){
        int[] nums={1,1,2,2,3,3,4,5};
        System.out.println("Length before removing duplicates:"+nums.length);
        int arrayLen=duplicatesLength(nums);
        System.out.println("Length after removing duplicates:"+arrayLen);
        for (int i=0;i<arrayLen;i++){
            System.out.print(nums[i]);
        }
    }
}
