package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 10:09 AM
 * 
 * @description
 */
public class Question55 {

    public boolean canJump(int[] nums) {
        // 预处理找到最大值
        return canJump(nums, nums.length - 1);
    }

    public boolean canJump(int[] nums, int currentIndex) {
        if (currentIndex == 0) {
            return true;
        }
        int changeIndex = Integer.MAX_VALUE;
        // 找到最大的移动范围
        for (int i = currentIndex - 1; i >= 0; i--) {
            if (currentIndex - i <= nums[i]) {
                changeIndex = i;
                break;
            }
        }
        if (changeIndex < currentIndex) {
            return canJump(nums, changeIndex);
        } else {
            return false;
        }
    }

}
