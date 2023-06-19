package com.wentjiang.leetcode.practice.day3;

public class Day3Question2 {

    //暴力求解法,二维数组存储当前列到之前某列的最小值,最小值*宽度即为当前的结果.
    public int question(int[] height) {
        if (height.length == 1) {
            return height[0];
        }
        int[][] min = new int[height.length][height.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < min[0].length; j++) {
                min[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                if (i == j) {
                    min[i][j] = height[i];
                } else {
                    min[i][j] = Math.min(min[i][j - 1], height[j]);
                }
                max = Math.max(max, (j - i + 1) * min[i][j]);
            }
        }
        return max;
    }
}
