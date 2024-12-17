package com.wentjiang.leetcode.q201_300;

public class Question283_1 {
    /**
     * 使用zero指针方式, 保证原有的顺序
     * 
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int zeroTail = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeroTail] = nums[i];
                if (zeroTail != i) {
                    nums[i] = 0;
                }
                zeroTail++;
            }
        }
    }
}
