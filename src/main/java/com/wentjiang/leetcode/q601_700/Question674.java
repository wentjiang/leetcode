package com.wentjiang.leetcode.q601_700;

public class Question674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int max = 1;
        int currentLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                currentLength++;
                if (currentLength > max) {
                    max = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        return max;
    }
}
