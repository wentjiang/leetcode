package com.wentjiang.leetcode.q1401_1500;

public class Question1464 {
    /**
     * 双游标,找出第一大和第二大的数
     */
    public int maxProduct(int[] nums) {
        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] >= max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
