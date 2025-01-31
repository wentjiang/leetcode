package com.wentjiang.leetcode.q1_100;

public class Question53 {
    //204 / 210 个通过的测试用例 超时
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int[] presum = new int[n];
        int result = nums[0];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                presum[i] = nums[0];
            } else {
                presum[i] = presum[i - 1] + nums[i];
            }
            result = Math.max(result, presum[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                result = Math.max(result, presum[j] - presum[i]);
            }
        }
        return result;
    }
}
