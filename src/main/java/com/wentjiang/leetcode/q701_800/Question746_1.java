package com.wentjiang.leetcode.q701_800;

public class Question746_1 {
    //使用动态规划, 数组的值表示当前花费的最小
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            dp[i] = Math.min(cost[i - 2] + dp[i - 2], cost[i - 1] + dp[i - 1]);
        }
        return dp[cost.length];
    }

    //优化存储空间,不使用数组,使用两个变量
    public int minCostClimbingStairs1(int[] cost) {
        int num1 = 0, num2 = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            int temp = Math.min(cost[i - 2] + num1, cost[i - 1] + num2);
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }

}
