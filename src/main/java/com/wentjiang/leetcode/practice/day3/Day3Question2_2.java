package com.wentjiang.leetcode.practice.day3;


/**
 * leetcode 84 
 */
public class Day3Question2_2 {
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
