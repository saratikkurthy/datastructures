package com.project.ds.numeric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSumEnhanced {
    public static List<List<Integer>> tripletsSum(int nums[],int sum){
        List<List<Integer>> triplets=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int current=i;
            int start=i+1;
            int end=nums.length-1;
            while (start<end){
                if(nums[current]+nums[start]+nums[end]==sum){
                    triplets.add(Arrays.asList(nums[current],nums[start],nums[end]));
                    start++;
                    end--;
                }
                else if(nums[current]+nums[start]+nums[end]>sum){
                    end--;
                }
                else {
                    start++;
                }
            }
        }

        return triplets;
    }

    public static void main(String... args){
        int[] nums={12,3,1,2,-6,5,-8,6};
        System.out.println(tripletsSum(nums,0));
    }
}
