package com.wentjiang.leetcode.q1401_1500;

public class Question1470 {

    /**
     * 新定义一个数组,返回新数组, 时间 on 空间 on
     *
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i];
            result[i*2+1] = nums[i+n];
        }
        return result;
    }

    /**
     * 优化算法, 因为所有的数字都是非负数,用负数进行标记算过的位
     */
}
