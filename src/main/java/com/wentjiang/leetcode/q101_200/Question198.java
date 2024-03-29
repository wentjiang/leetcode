package com.wentjiang.leetcode.q101_200;

import java.util.Arrays;

public class Question198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int arrayMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - 2 >= 0) {
                arrayMax = Math.max(arrayMax, nums[i - 2]);
                nums[i] = arrayMax + nums[i];
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
