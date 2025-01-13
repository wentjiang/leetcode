package com.wentjiang.leetcode.q201_300;

import java.util.Arrays;

public class Question215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];

    }
}
