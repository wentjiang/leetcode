package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/15 2:32 PM
 * 
 * @description
 */
public class Question35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (target < nums[i]) {
                if (i == 0) {
                    return 0;
                } else {
                    return i;
                }
            }
        }
        return nums.length;
    }
}
