package com.wentjiang.leetcode.q2501_2600;

public class Question2536 {
    /**
     * 将二维数组 当做一维数组,使用前缀和 + 差分方法求解
     * copy
     */
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n + 2][n + 2], ans = new int[n][n];
        for (int[] query : queries) {
            diff[query[0] + 1][query[1] + 1]++;
            diff[query[0] + 1][query[3] + 2]--;
            diff[query[2] + 2][query[1] + 1]--;
            diff[query[2] + 2][query[3] + 2]++;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                ans[i - 1][j - 1] = (diff[i][j] += diff[i - 1][j] + diff[i][j - 1] - diff[i - 1][j - 1]);
            }
        }
        return ans;
    }
}
