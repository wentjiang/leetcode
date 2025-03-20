package com.wentjiang.leetcode.q1001_1100;

public class Question1004 {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int count0 = 0;
        int max = 0;
        while (r < nums.length) {
            if (nums[r] == 1) {
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                if (count0 < k) {
                    max = Math.max(max, r - l + 1);
                    r++;
                    count0++;
                } else {
                    while (nums[l] != 0) {
                        l++;
                    }
                    count0--;
                    l++;
                }
            }
        }
        return max;
    }
}
