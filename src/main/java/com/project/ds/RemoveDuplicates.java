package com.project.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        inputList.add(4);
        inputList.add(1);
        inputList.add(6);
        inputList.add(4);
        inputList.add(1);
        inputList.add(3);
        inputList.add(1);
        inputList.add(2);
        inputList.add(5);
        inputList.add(2);
        Integer[] result = removeDuplicatesSor(inputList);
        System.out.println(Arrays.asList(result));
        result = removeDuplicatesMap(inputList);
        System.out.println(Arrays.asList(result));

    }

    /**
     * This method will have Time complexity of O(nlogn)
     *
     * @param input
     * @return
     */
    public static Integer[] removeDuplicatesSor(ArrayList<Integer> input) {
        Integer[] n = input.toArray(new Integer[0]);
        if (input.isEmpty()) {
            return new Integer[0];
        }
        Arrays.sort(n);
        ArrayList<Integer> retList = new ArrayList<Integer>();
        for (int i = 0; i < n.length; i++) {
            if (i > 0) {
                if (n[i] != n[i - 1]) {
                    retList.add(n[i]);
                }
            } else {
                retList.add(n[i]);
            }
        }

        return retList.toArray(new Integer[retList.size()]);
    }

    /**
     * This method will have Time complexity of O(n)
     * @param input
     * @return
     */

    public static Integer[] removeDuplicatesMap(ArrayList<Integer> input) {
        HashMap<Integer,Boolean> uniqueMap=new HashMap<Integer,Boolean>();
        ArrayList<Integer> retList = new ArrayList<Integer>();
        for(int i=0;i<input.size();i++){
            if(uniqueMap.get(input.get(i)) == null){
                uniqueMap.put(input.get(i),true);
                retList.add(input.get(i));
            }
        }
        return retList.toArray(new Integer[retList.size()]);
    }
}
