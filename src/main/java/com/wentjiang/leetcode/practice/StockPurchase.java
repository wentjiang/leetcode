package com.wentjiang.leetcode.practice;

import java.util.Arrays;
import java.util.Scanner;

//售卖股票最高价
public class StockPurchase {

    public static int stockPurchase(int[] prices) {
        int result = 0;
        if (prices.length == 0 || prices.length == 1) {
            return result;
        }
        int currentMax = Integer.MIN_VALUE;
        int currentMin = prices[0];

        for (int i = 1; i < prices.length; i++) {
            // 后一个大于等于前一个的情况
            if (prices[i - 1] <= prices[i]) {
                currentMax = prices[i];
                // 小于的情况,生成新的区间
            } else if (prices[i - 1] > prices[i]) {
                if (currentMax > currentMin) {
                    result = Math.max(currentMax - currentMin, result);
                }
                currentMin = Math.min(prices[i], currentMin);
                currentMax = Integer.MIN_VALUE;
            }
        }

        if (currentMax > currentMin) {
            result = Math.max(currentMax - currentMin, result);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            int[] arrays = Arrays.stream(b.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(stockPurchase(arrays));
        }
    }

}
