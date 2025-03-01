package com.wentjiang.leetcode.q401_500;

public class Question494 {
    /**
     * 动态规划, 所有的正数(p) + 负数(n) 总和等于 target. p + n = target
     * 正数 + 负数取反 等于所有数之和 p - n = sum
     * 2p = sum + target
     * p = (sum + target) / 2
     * 求出所有能够达到p的可能性
     *
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum - target < 0 || (sum - target) % 2 != 0) {
            return 0;
        }
        int result = (sum - target) / 2;
        int[][] dp = new int[nums.length + 1][result + 1];
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= nums.length; i++) {
            int num = nums[i - 1];
            for (int j = 0; j <= result; j++) {

                dp[i][j] = dp[i - 1][j];
                if (j >= num) {
                    dp[i][j] += dp[i - 1][j - num];
                }
            }
        }
        return dp[nums.length][result];
    }
}
