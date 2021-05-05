package com.wentjiang.leetcode.q201_300;

public class Question283 {
    /**
     * 一次遍历法
     */
    public void moveZeroes1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }

    /**
     * 双指针法
     */
    public void moveZeroes2(int[] nums) {
        int notZeroNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[notZeroNum++] = nums[i];
            }
        }
        for (int i = notZeroNum; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
