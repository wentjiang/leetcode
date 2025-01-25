package com.wentjiang.leetcode.q201_300;

public class Question238 {
    /**
     * 使用前缀积和后缀积进行计算
     */
    public int[] productExceptSelf(int[] nums) {
        int[] preProduct = new int[nums.length];
        int[] postProduct = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                preProduct[i] = nums[0];
                postProduct[nums.length - 1] = nums[nums.length - 1];
            } else {
                preProduct[i] = preProduct[i - 1] * nums[i];
                postProduct[nums.length - 1 - i] = postProduct[nums.length - i] * nums[nums.length - i - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = postProduct[i + 1];
            } else if (i == nums.length - 1) {
                nums[i] = preProduct[i - 1];
            } else {
                nums[i] = preProduct[i - 1] * postProduct[i + 1];
            }
        }
        return nums;
    }
}
