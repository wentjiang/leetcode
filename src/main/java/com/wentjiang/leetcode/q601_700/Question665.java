package com.wentjiang.leetcode.q601_700;

/**
 * 判断是否只改变一个数的情况下让数组有序
 */
public class Question665 {

    /**
     * 两个数逆序数同时变成小的数或大的数,看新数组是否顺序正确
     */
    public boolean checkPossibility(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp1 = nums[i];
                int temp2 = nums[i + 1];
                nums[i + 1] = temp1;
                if (checkSorted(nums)) {
                    return true;
                }
                nums[i] = temp2;
                nums[i + 1] = temp2;
                if (checkSorted(nums)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public boolean checkSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
