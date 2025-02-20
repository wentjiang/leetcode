package com.wentjiang.leetcode.q701_800;

public class Question746 {
    /**
     * 动态规划,用额外的数组来存储当前的状态
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] totalCost = new int[cost.length];
        if (cost.length < 2) {
            return 0;
        }
        totalCost[0] = 0;
        totalCost[1] = 0;

        for (int i = 2; i < cost.length; i++) {
            totalCost[i] = Math.min(totalCost[i - 2] + cost[i - 2], totalCost[i - 1] + cost[i - 1]);
        }
        return Math.min(totalCost[cost.length - 1] + cost[cost.length - 1], totalCost[cost.length - 2] + cost[cost.length - 2]);
    }

    //优化,只用两个额外的空间来存储
    public int minCostClimbingStairs1(int[] cost) {
        int[] totalCost = new int[2];
        if (cost.length < 2) {
            return 0;
        }

        for (int i = 2; i < cost.length; i++) {
            int currentCost = Math.min(totalCost[0] + cost[i - 2], totalCost[1] + cost[i - 1]);
            totalCost[0] = totalCost[1];
            totalCost[1] = currentCost;
        }
        return Math.min(totalCost[1] + cost[cost.length - 1], totalCost[0] + cost[cost.length - 2]);
    }
}
