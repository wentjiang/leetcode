package com.wentjiang.leetcode.q1_100;

public class Question42_2 {
    public int trap(int[] height) {
        int result = 0;
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];
        int leftIndex = 1;
        int rightIndex = height.length - 2;
        while (leftIndex <= rightIndex) {
            if (maxLeft < maxRight) {
                result += Math.max(maxLeft - height[leftIndex], 0);
                maxLeft = Math.max(maxLeft, height[leftIndex]);
                leftIndex++;
            } else {
                result += Math.max(maxRight - height[rightIndex], 0);
                maxRight = Math.max(maxRight, height[rightIndex]);
                rightIndex--;
            }
        }
        return result;
    }
}
