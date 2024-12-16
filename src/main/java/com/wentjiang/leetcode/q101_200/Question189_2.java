package com.wentjiang.leetcode.q101_200;

public class Question189_2 {
    /**
     * 两次逆置的方式
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int move;
        if (k < nums.length) {
            move = k;
        } else {
            move = k % nums.length;
        }
        reverse(nums, 0, nums.length);
        reverse(nums, 0, move);
        reverse(nums, move, nums.length);
    }

    public static void reverse(int[] nums, int start, int end) {
        for (int i = start; i < (end + start) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[end - 1 - (i - start)];
            nums[end - 1 - (i - start)] = temp;
        }
    }
}
