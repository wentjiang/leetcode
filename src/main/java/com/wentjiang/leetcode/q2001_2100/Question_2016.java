package com.wentjiang.leetcode.q2001_2100;

public class Question_2016 {
    public int maximumDifference(int[] nums) {
        int result = -1;
        if (nums.length <= 1) {
            return result;
        }
        int minNum = nums[0];
        for (int num : nums) {
            if (num > minNum && result < (num - minNum)) {
                result = num - minNum;
            } else if (minNum > num) {
                minNum = num;
            }
        }
        return result;
    }
}
