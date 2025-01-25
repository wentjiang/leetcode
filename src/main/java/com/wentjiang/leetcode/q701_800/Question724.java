package com.wentjiang.leetcode.q701_800;

public class Question724 {
    /**
     * 使用前缀和数组,
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int[] presum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                presum[i] = nums[i];
            } else {
                presum[i] = nums[i] + presum[i - 1];
            }
        }
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (presum[nums.length - 1] - presum[i] == 0) {
                    return 0;
                }
            } else if (presum[nums.length - 1] - presum[i] == presum[i - 1]) {
                result = i;
                break;
            }
        }
        return result;
    }
}
