package com.wentjiang.leetcode.q1_100;

public class Question11_3 {
    // n^2 时间复杂度
    public int maxArea(int[] height) {
        int size = height.length;
        int result = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                result = Math.max(Math.min(height[i], height[j]) * (j - i), result);
            }
        }
        return result;
    }
}
