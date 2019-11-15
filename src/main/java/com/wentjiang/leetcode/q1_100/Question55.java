package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2019/11/15 10:09 AM
 * @description
 */
public class Question55 {

    private int max = 0;

    public boolean canJump(int[] nums) {
        //预处理找到最大值
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return canJump(nums, nums.length - 1);
    }

    public boolean canJump(int[] nums, int currentIndex) {
        System.out.println("current index " + currentIndex);
        if (currentIndex == 0) {
            return true;
        }
        int changeIndex = Integer.MAX_VALUE;
        //找到最大的移动范围
        int maxIndex = Math.max(0, currentIndex - max);
        int backIndex = currentIndex - maxIndex;
        for (int i = currentIndex - backIndex; i < currentIndex; i++) {
            System.out.println("change index " + i);
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
