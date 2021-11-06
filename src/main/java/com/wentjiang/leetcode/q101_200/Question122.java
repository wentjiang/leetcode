package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/20 12:29 PM
 * 
 * @description
 */
public class Question122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
