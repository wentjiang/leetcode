package com.wentjiang.leetcode.q101_200;

public class Question122_2 {

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            int increase = prices[i] - prices[i - 1];
            if (increase > 0) {
                result += increase;
            }
        }
        return result;
    }
}
