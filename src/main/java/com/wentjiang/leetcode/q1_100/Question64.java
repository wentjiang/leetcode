package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 3:10 PM
 * 
 * @description
 */
public class Question64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int line = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                if (i > 0 && j > 0) {
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                } else if (i > 0) {
                    grid[i][j] += grid[i - 1][j];
                } else if (j > 0) {
                    grid[i][j] += grid[i][j - 1];
                }
            }
        }
        return grid[row - 1][line - 1];
    }
}
