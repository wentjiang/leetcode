package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2019/10/19 10:12 AM
 * @description
 */
public class Question121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 0 || prices.length == 1) {
            return profit;
        }

        for (int i = prices.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int temp = prices[i] - prices[j];
                if (prices[i] - prices[j] > profit) {
                    profit = temp;
                }
            }
        }

        return profit;
    }
}
