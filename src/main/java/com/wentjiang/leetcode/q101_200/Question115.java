package com.wentjiang.leetcode.q101_200;

public class Question115 {

    /**
     * //todo 还没有完全掌握该题状态转移的思想
     */
    public int numDistinct(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength < tLength){
            return 0;
        }

        int[][] dp = new int[sLength + 1][tLength + 1];

        for (int i = 0; i <= sLength ; i++) {
            dp[i][tLength] = 1;
        }

        for (int i = sLength - 1; i >= 0; i--) {
            char chi = s.charAt(i);
            for (int j = tLength - 1; j >= 0; j--) {
                char chj = t.charAt(j);
                if (chi == chj) {
                    dp[i][j] = dp[i + 1][j] + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }

        return dp[0][0];
    }
}
