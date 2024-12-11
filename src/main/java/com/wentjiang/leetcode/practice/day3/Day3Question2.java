package com.wentjiang.leetcode.practice.day3;

public class Day3Question2 {

    // 暴力求解法,二维数组存储当前列到之前某列的最小值,最小值*宽度即为当前的结果.
    public int question(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                if (i == j) {
                    max = Math.max(max, minHeight);
                } else {
                    max = Math.max(max, (j - i + 1) * minHeight);
                }
            }
        }
        return max;
    }
}
