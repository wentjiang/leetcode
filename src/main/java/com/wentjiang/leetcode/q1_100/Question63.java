package com.wentjiang.leetcode.q1_100;

public class Question63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m == 1 && n == 1 && obstacleGrid[0][0] == 0) {
            return 1;
        }
        if (m == 1 && n == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        obstacleGrid[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                } else {
                    if (i - 1 >= 0 && obstacleGrid[i - 1][j] != -1) {
                        obstacleGrid[i][j] += obstacleGrid[i - 1][j];
                    }
                    if (j - 1 >= 0 && obstacleGrid[i][j - 1] != -1) {
                        obstacleGrid[i][j] += obstacleGrid[i][j - 1];
                    }
                }
            }
        }
        return obstacleGrid[m - 1][n - 1] == -1 ? 0 : obstacleGrid[m - 1][n - 1];
    }
}
