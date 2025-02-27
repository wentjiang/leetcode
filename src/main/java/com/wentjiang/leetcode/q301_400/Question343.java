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
        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
            for (int j = i-1; j > 0; j--) {
                if (i-j > dp[i-j]){
                    dp[i] = Math.max(dp[i], (i - j) * j);
                }else{
                    dp[i] = Math.max(dp[i], dp[i-j] * j);
                }
            }
        }
        return dp[n];
    }
}
