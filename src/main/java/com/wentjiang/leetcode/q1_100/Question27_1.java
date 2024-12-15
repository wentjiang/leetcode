package com.wentjiang.leetcode.q1_100;

public class Question27_1 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k++;
            } else {
                nums[i - k] = nums[i];
            }
        }
        return nums.length - k;
    }
}
