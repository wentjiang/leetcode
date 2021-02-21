package com.wentjiang.leetcode.q501_600;

import java.util.Arrays;

public class Question561 {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result += nums[i];
            }
        }
        return result;
    }
}
