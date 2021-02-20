package com.wentjiang.leetcode.q401_500;

public class Question485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
                max = Math.max(current, max);
            } else {
                current = 0;
            }
        }
        return max;
    }
}
