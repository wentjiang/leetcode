package com.wentjiang.leetcode.q201_300;

public class Question209 {
    /**
     * 使用前缀和, 从后往前进行遍历
     */
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int[] presum = new int[nums.length];
        presum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            presum[i] = presum[i - 1] + nums[i];
        }
        for (int i = nums.length - 1; i >= 0 && presum[i] >= target; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (i - j < min) {
                    if (presum[i] - presum[j] >= target) {
                        min = Math.min(min, i - j);
                        break;
                    }
                }
            }
            if (presum[i] >= target) {
                min = Math.min(min, i + 1);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        } else {
            return min;
        }
    }
}
