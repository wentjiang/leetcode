package com.wentjiang.leetcode.q601_700;

public class Question643 {
    /**
     * 暴力求解法
     */
    public double findMaxAverage(int[] nums, int k) {
        int sumK = 0;
        for (int j = 0; j < k; j++) {
            sumK += nums[j];
        }
        int maxSumK = sumK;
        for (int i = 0; i < nums.length - k; i++) {
            sumK = sumK - nums[i] + nums[i + k];
            maxSumK = Math.max(sumK, maxSumK);
        }
        return (double) maxSumK / (double) k;
    }
}
