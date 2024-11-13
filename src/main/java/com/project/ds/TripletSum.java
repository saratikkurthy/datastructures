package com.project.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static List<List<Integer>> tripletSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            if (i == 0 || nums[i] != nums[i - 1]) {
                while (start < end) {
                    int currentSum = nums[i] + nums[start] + nums[end];
                    if (currentSum == 0) {
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            start--;
                        }
                        start++;
                        end--;
                    }
                    else if(currentSum>0){
                        end--;
                    }
                    else {
                        start++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> output;
        output=tripletSum(nums);
        System.out.println(output);
    }
}
