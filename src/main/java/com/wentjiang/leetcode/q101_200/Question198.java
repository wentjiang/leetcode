package com.wentjiang.leetcode.q101_200;

import java.util.Arrays;

public class Question198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int[] result = new int[nums.length];
        int arrayMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - 2 >= 0) {
                arrayMax = Math.max(arrayMax, result[i - 2]);
                result[i] = arrayMax + nums[i];
            } else {
                result[i] = nums[i];
            }
        }
        return Arrays.stream(result).max().getAsInt();
    }
}
