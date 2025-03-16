package com.project.ds.numeric;

import java.util.*;

public class FourNumberSum {
    public static List<List<Integer>> fourSum(int nums[],int target){
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,List<Integer>> numMap=new HashMap<>();
        int mapSum=0;

        for(int i=1;i<nums.length -1;i++){
            for(int j=i+1;j<nums.length;j++){
               int currSum=nums[i]+nums[j];
               int difference=target-currSum;
               if(numMap.get(difference)!=null){
                   //result.add(numMap.get(difference),nums[i],nums[j])
                   Collections.addAll(Arrays.asList(numMap.get(difference),nums[i],nums[j]));
                   Integer[] temp=numMap.get(difference).toArray(new Integer[]{});
                   //result.add(numMap.get(difference));
                   result.add(Arrays.asList(temp[0],temp[1],nums[i],nums[j]));
               }
            }
            for(int k=0;k<i;k++){
                int currentSum=nums[i]+nums[k];
                if(numMap.get(currentSum)==null){
                    List<Integer> tempNums=new ArrayList<>();
                    //tempNums.add(Arrays.asList(nums[i],nums[k]));
                    tempNums.add(nums[i]);
                    tempNums.add(nums[k]);

                    numMap.put(currentSum, tempNums);
                }
                else{
                    List<Integer> val=numMap.get(currentSum);
                    //val.add(Arrays.asList(nums[i],nums[k]));
                    val.add(nums[i]);
                    val.add(nums[k]);
                    numMap.put(currentSum,val);
                }
            }
        }


        return result;
    }
    public static void main(String... args){
        int[] input={7,6,4,-1,1,2};

        System.out.println(fourSum(input,16));


    }
}
