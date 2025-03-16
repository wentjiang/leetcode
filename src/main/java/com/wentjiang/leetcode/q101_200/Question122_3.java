package com.wentjiang.leetcode.q101_200;

public class Question122_3 {
    /**
     * 动态规划
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        //0 表示当天的最多的收益, 1 表示当天卖出最多的收益
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }

        return dp[prices.length - 1][0];
    }
}
