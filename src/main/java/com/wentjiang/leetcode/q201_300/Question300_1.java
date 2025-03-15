package com.wentjiang.leetcode.q201_300;

public class Question300_1 {

    /**
     * 不能使用单调栈, 需要使用动态规划的方式
     * <p>
     * dp[i] 表示第i位数最大的子数组的长度.
     *
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    max = Math.max(dp[j] + 1, max);
                }
            }
            dp[i] = max;
            result = Math.max(max, result);
        }
        return result;
    }
}
