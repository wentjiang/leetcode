package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2019/11/15 2:50 PM
 * @description
 */
public class Question62 {

    public int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];
        result[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    result[i][j] += result[i - 1][j];
                }
                if (j > 0) {
                    result[i][j] += result[i][j - 1];
                }
            }
        }
        return result[m - 1][n - 1];
    }

}
