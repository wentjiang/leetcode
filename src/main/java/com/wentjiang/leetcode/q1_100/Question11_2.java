package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/6 10:55 AM
 * @description
 */
public class Question11_2 {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }
}
