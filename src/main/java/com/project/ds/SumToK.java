package com.project.ds;

import java.util.HashMap;

public class SumToK {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(findPair(nums,6));
    }

    static boolean findPair(int[] arr, int k){
        HashMap<Integer,Boolean> visited = new HashMap<Integer,Boolean>();
        for(int element : arr){
            if(visited.containsKey(k-element)) return true;
            else visited.put(element, true);
        }
        return false;
    }


}
