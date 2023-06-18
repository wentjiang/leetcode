package com.wentjiang.leetcode.q1_100;

public class Question11_4 {

    // n 复杂度
    public int maxArea(int[] height) {
        int size = height.length;
        int result = 0;
        int left = 0;
        int right = size - 1;

        while (left < right) {
            result = Math.max(Math.min(height[left], height[right]) * (right - left), result);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

}
