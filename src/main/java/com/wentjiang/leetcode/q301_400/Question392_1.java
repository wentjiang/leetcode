package com.wentjiang.leetcode.q301_400;

public class Question392_1 {

    /**
     * 使用DP的方法求解
     * 状态转移, 求最长公共的子序列, 子序列的长度需要与s的长度相同
     * <p>
     * s 子序列
     * t 父序列
     */

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int sLength = s.length();
        int pLength = t.length();

        int[][] dp = new int[pLength + 1][sLength + 1];

        for (int i = pLength - 1; i >= 0; i--) {
            char chi = t.charAt(i);
            for (int j = sLength - 1; j >= 0; j--) {
                char chj = s.charAt(j);
                if (chi == chj) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][0] == s.length();
    }
}
