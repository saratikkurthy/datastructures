package com.project.ds.numeric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestDifference {
    public static int[] smallestDiff(int[] nums1,int nums2[]){
        int[] result=new int[2];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int nums1Idx=0;
        int nums2Idx=0;
        int min=Integer.MAX_VALUE;
        int diff=0;
        int firstNum=0;
        int secondNum=0;
        while (nums1Idx < nums1.length && nums2Idx < nums2.length){
            firstNum=nums1[nums1Idx];
            secondNum=nums2[nums2Idx];
           if(firstNum < secondNum){
               diff=secondNum-firstNum;
               nums1Idx++;
            }
           else  if(firstNum > secondNum){
               diff=firstNum-secondNum;
               nums2Idx++;
           }
           else {
               result[0]=firstNum;
               result[1]=secondNum;
               return result;
           }
           if(min>diff){
               min=diff;
               result[0]=firstNum;
               result[1]=secondNum;
           }
        }

        return result;
    }
    public static void main(String... args){
        int[] nums1={-1,5,10,20,28,3};
        int[] nums2={26,133,130,16,17};
        System.out.println(Arrays.toString(smallestDiff(nums1,nums2)));
    }
}
