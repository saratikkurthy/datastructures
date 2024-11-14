package com.project.ds;

import java.util.Arrays;

public class ProductExcludingSelf {
    public static int[] productNums(int[] nums) {

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product = product * nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = product / nums[i];
            } else {
                nums[i] = 0;
            }

        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(productNums(nums)));
    }
}
