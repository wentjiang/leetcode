package com.wentjiang.leetcode.q201_300;

public class Question215_1 {

    /**
     * 使用桶排序,因为数值的范围是-10000 到 10000, 以 10000为原点
     */
    public int findKthLargest(int[] nums, int k) {
        int[] bucket = new int[20001];
        for (int num : nums) {
            bucket[num + 10000] += 1;
        }
        for (int i = 20000; i >= 0; i--) {
            while (bucket[i] > 0) {
                bucket[i] -= 1;
                k--;
                if (k == 0) {
                    return i - 10000;
                }
            }
        }
        return 0;
    }
}
