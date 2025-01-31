package com.wentjiang.leetcode.q1_100;

public class Question53_1 {
    /**
     * 动态规划, 找出每个位置的最大值
     */
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            result = Math.max(pre, result);
        }
        return result;
    }
}
