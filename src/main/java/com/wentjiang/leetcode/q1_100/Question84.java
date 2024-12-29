package com.wentjiang.leetcode.q1_100;

public class Question84 {
    /**
     * 暴力法求解,穷举所有的情况,算出结果, 时间复杂度n2, 空间复杂度1. 通过 91/99 超时
     * 
     * @param heights
     * 
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int maxH = heights[i];
            for (int j = i; j < heights.length; j++) {
                int w = j - i + 1;
                maxH = Math.min(maxH, heights[j]);
                int currentValue = w * maxH;
                max = Math.max(max, currentValue);
            }
        }
        return max;
    }
}
