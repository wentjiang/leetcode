package com.wentjiang.leetcode.q901_1000;

import java.util.Arrays;

public class Question977 {
    /**
     * 方法1: 所有的数字都平方,再排序, 时间: nlogn 空间 1 方法2: 需要时间为n 前后指针方法,从两边往中间替换数组 时间n 空间n
     *
     * @param nums
     * 
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }

    /**
     * @param nums
     * 
     * @return
     */
    public int[] sortedSquares2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        int p0 = 0;
        int p1 = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num0 = nums[p0];
            int num1 = nums[p1];
            if (num0 > num1) {
                result[p1 - p0] = num0;
                p0++;
            } else {
                result[p1 - p0] = num1;
                p1--;
            }
        }
        return result;
    }
}
