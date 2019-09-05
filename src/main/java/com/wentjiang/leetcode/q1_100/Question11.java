package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/5 2:54 PM
 * @description
 */
public class Question11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        if (height.length <= 1) {
            return 0;
        }
        for (int i = 0; i < height.length; i++) {
            int startHigh = height[i];
            int maxHigh = 0;
            for (int j = height.length - 1; j > i; j--) {
                int endHigh = height[j];
                if (endHigh < maxHigh) {
                    continue;
                } else {
                    maxHigh = endHigh;
                    int area = Math.min(startHigh, endHigh) * (j - i);
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
    }
}
