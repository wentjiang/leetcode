package com.wentjiang.leetcode.q101_200;

public class Question189 {
    //使用额外的存储空间来移动
    // 时间复杂度 O(n), 空间复杂度 O(n)
    public static void rotate(int[] nums, int k) {
        int move;
        if (k < nums.length) {
            move = k;
        } else {
            move = k % nums.length;
        }
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newIndex = (i+move)%nums.length;
            newNums[newIndex] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, nums.length);
    }
}
