package com.wentjiang.leetcode.q901_1000;

public class Question931 {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = matrix[i][j];
                int tempMin = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    tempMin = Math.min(tempMin, dp[i - 1][j - 1]);
                }
                tempMin = Math.min(tempMin, dp[i - 1][j]);
                if (j + 1 < n) {
                    tempMin = Math.min(tempMin, dp[i - 1][j + 1]);
                }
                dp[i][j] += tempMin;
            }
        }
        for (int j = 0; j < n; j++) {
            min = Math.min(min, dp[m - 1][j]);
        }
        return min;
    }
}
