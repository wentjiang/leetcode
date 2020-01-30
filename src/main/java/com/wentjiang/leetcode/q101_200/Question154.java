package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2020/1/30 7:31 PM
 * @description
 */
public class Question154 {
    public int findMin(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return nums[i];
            }
        }
        return nums[0];
    }
}
