package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/10 2:07 PM
 * @description
 */
public class Question26 {
    public int removeDuplicates(int[] nums) {
        int deleteNum = 0;
        if (nums.length != 0) {
            for (int i = 0; i < nums.length; i++) {
                if (i != 0 && nums[i] == nums[i - 1]) {
                    deleteNum++;
                }
                int head = i - deleteNum;
                nums[head] = nums[i];
            }
        }
        return nums.length - deleteNum;
    }
}
