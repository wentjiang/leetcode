package com.wentjiang.leetcode.q201_300;

import java.util.Arrays;

public class Question268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] - 1) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
