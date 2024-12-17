package com.wentjiang.leetcode.q1_100;

public class Question27_2 {
    public static int removeElement(int[] nums, int val) {
        int retainNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[retainNum] = nums[i];
                retainNum++;
            }
        }
        return retainNum;
    }
}
