package com.wentjiang.leetcode.q1101_1200;

public class Question1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        int[][] dp = new int[length1 + 1][length2 + 1];
        int result = 0;
        for (int i = 1; i < length1 + 1; i++) {
            char ch1 = text1.charAt(i - 1);
            for (int j = 1; j < length2 + 1; j++) {
                char ch2 = text2.charAt(j - 1);
                int max = 0;
                if (ch1 == ch2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                result = Math.max(dp[i][j], result);
            }
        }
        return result;
    }
}
