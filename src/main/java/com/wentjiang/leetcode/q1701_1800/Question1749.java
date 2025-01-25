package com.wentjiang.leetcode.q1701_1800;

public class Question1749 {
    /**
     * 前缀和求解, 并且找到最大和,最小和
     */
    public int maxAbsoluteSum(int[] nums) {
        int[] preSum = new int[nums.length];
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                preSum[i] = nums[i];
            } else {
                preSum[i] = preSum[i - 1] + nums[i];
                min = Math.min(preSum[i], min);
                max = Math.max(preSum[i], max);
            }
        }
        if (min > 0) {
            return max;
        } else if (max < 0) {
            return -min;
        } else {
            return max - min;
        }
    }
}
