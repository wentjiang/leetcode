package com.wentjiang.leetcode.q701_800;

public class Question718 {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        int result = 0;
        for (int i = nums1.length - 1; i >= 0; i--) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = 1;
                    if (i + 1 < nums1.length && j + 1 < nums2.length) {
                        dp[i][j] += dp[i + 1][j + 1];
                    }
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }
}
