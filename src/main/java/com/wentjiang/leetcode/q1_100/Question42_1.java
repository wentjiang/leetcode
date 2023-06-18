package com.wentjiang.leetcode.q1_100;

public class Question42_1 {
    public int trap(int[] height) {
        int result = 0;

        int[] leftHigh = new int[height.length];
        int[] rightHigh = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            if (i == 0) {
                leftHigh[i] = height[i];
            } else if (i == 1) {
                leftHigh[i] = height[i - 1];
            } else {
                leftHigh[i] = Math.max(height[i - 1], leftHigh[i - 1]);
            }

        }
        for (int i = height.length - 1; i >= 0; i--) {
            if (i == height.length - 1) {
                rightHigh[i] = height[i];
            } else if (i == height.length - 2) {
                rightHigh[i] = height[i + 1];
            } else {
                rightHigh[i] = Math.max(height[i + 1], rightHigh[i + 1]);
            }
        }

        for (int i = 1; i < height.length - 1; i++) {
            result += Math.max(Math.min(leftHigh[i], rightHigh[i]) - height[i], 0);
        }

        return result;
    }

}
