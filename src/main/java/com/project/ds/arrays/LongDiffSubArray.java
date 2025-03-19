package com.project.ds.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongDiffSubArray {
    public int longDiffSubArray(List<Integer> a){
        int result=0;
        int prev=a.get(0);
        int currentRes=0;
        Collections.sort(a);
        //Time Complexity O(n)
        for(int i=1;i<a.size();i++){
            int current=a.get(i);
            if(Math.abs(current-prev)<=1){
                currentRes++;
            }
            else {
                result=Math.max(result,currentRes);
                currentRes=0;
            }
            result=Math.max(result,currentRes);
            prev=current;
        }

        return result+1;
    }
    public static void main(String... args){
        //int[] nums={1,1,2,2,4,4,5,5,5};
        List<Integer> nums=new ArrayList<>();
        nums.add(4);
        nums.add(6);
        nums.add(5);
        nums.add(3);
        nums.add(3);
        nums.add(1);

        LongDiffSubArray obj=new LongDiffSubArray();
        System.out.println("Longest SubArray difference is:"+obj.longDiffSubArray(nums));

    }
}
