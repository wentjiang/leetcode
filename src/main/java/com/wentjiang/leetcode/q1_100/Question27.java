package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/10 2:59 PM
 * 
 * @description
 */
public class Question27 {
    public int removeElement(int[] nums, int val) {
        int deleteNum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i - deleteNum] = nums[i];
            if (nums[i] == val) {
                deleteNum++;
            }
        }
        return nums.length - deleteNum;
    }
}
