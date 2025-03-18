package com.wentjiang.leetcode.q701_800;

import java.util.Arrays;

public class Question740_1 {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int[] sums = new int[max + 1];
        for (int num : nums) {
            sums[num] += num;
        }

        int[] dp = new int[sums.length + 2];

        for (int i = 2; i < sums.length + 2; i++) {
            dp[i] = Math.max(dp[i - 2] + sums[i - 2], dp[i - 1]);
        }
        return dp[sums.length + 1];
    }
}
