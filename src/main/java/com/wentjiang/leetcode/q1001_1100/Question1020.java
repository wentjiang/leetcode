package com.wentjiang.leetcode.q1001_1100;

public class Question1020 {
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int rowlength = grid.length;
        int colLenght = grid[0].length;
        for (int i = 0; i < rowlength; i++) {
            for (int j = 0; j < colLenght; j++) {
                // 边沿情况
                if (grid[i][j] == 1 && isEdge(i, j, rowlength, colLenght)) {
                    grid[i][j] = 2;
                    // 延伸到周围的进行判断
                    effectAround(grid, i, j);
                }
            }
        }
        for (int[] ints : grid) {
            for (int j = 0; j < colLenght; j++) {
                if (ints[j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void effectAround(int[][] grid, int i, int j) {
        // 左
        if (j > 0 && grid[i][j - 1] == 1) {
            grid[i][j - 1] = 2;
            effectAround(grid, i, j - 1);
        }
        // 右
        if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
            grid[i][j + 1] = 2;
            effectAround(grid, i, j + 1);
        }
        // 上
        if (i > 0 && grid[i - 1][j] == 1) {
            grid[i - 1][j] = 2;
            effectAround(grid, i - 1, j);
        }
        // 下
        if (i < grid.length - 1 && grid[i + 1][j] == 1) {
            grid[i + 1][j] = 2;
            effectAround(grid, i + 1, j);
        }
    }

    private boolean isEdge(int x, int y, int rowLength, int colLength) {
        return x == 0 || y == 0 || x == rowLength - 1 || y == colLength - 1;
    }
}
