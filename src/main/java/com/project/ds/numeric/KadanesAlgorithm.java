package com.project.ds.numeric;

public class KadanesAlgorithm {
    /**
     * Brute force wth Time complexity O(n)=n^2
     *
     * @param nums
     * @return
     */
    public static int maxSubArraySumBF(int[] nums) {
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                sum = Math.max(sum, currentSum);
            }
        }
        return sum;
    }

    public static int maxSubArrayKadane(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Find the maximum sum ending at index i by either extending
            // the maximum sum sub array ending at index i - 1 or by
            // starting a new sub array from index i
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            // Update sum if maximum sub array sum ending at index i > res
            sum = Math.max(sum, maxSum);
        }
        return sum;
    }
}
