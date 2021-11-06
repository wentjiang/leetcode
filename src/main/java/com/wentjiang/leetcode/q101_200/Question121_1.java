package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/20 11:59 AM
 * 
 * @description
 */
public class Question121_1 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 0 || prices.length == 1) {
            return profit;
        }
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
