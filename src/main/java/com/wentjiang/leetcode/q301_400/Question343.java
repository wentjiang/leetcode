package com.wentjiang.leetcode.q301_400;

public class Question343 {
    /**
     * 使用动态规划, 数组中保存当前的数字最大的乘积
     *
     * @param n 当前的数
     * @return 返回最大乘积
     */
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i ; j++) {
                int max = Math.max(j * (i - j), dp[j] * (i-j));
                dp[i] = Math.max(max,dp[i]);
            }
        }
        return dp[n];
    }
}
