package com.wentjiang.leetcode.q501_600;

public class Question560_1 {
    /**
     * 直接枚举
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
