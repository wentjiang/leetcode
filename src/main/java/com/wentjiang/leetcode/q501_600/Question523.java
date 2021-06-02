package com.wentjiang.leetcode.q501_600;

public class Question523 {
    /**
     * 前缀法,issue:there are too many data cause timeout error
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        int shortestLength = 2;
        int[] temps = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            temps[i + 1] = nums[i] + temps[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + shortestLength; j < nums.length + 1; j++) {
                if ((temps[j] - temps[i]) % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
