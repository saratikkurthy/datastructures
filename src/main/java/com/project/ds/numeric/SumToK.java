package com.project.ds.numeric;

import java.util.HashMap;

public class SumToK {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int[] nums = {3,11,5,2,1,6};
        System.out.println(findPair(nums,7));
    }

    /**
     *
     * @param arr
     * @param k
     * @return
     */
    static boolean findPair(int[] arr, int k){
        HashMap<Integer,Boolean> visited = new HashMap<Integer,Boolean>();
        for(int element : arr){
            if(visited.containsKey(k-element)) return true;
            else visited.put(element, true);
        }
        return false;
    }


}
