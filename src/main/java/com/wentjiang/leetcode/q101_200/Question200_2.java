package com.wentjiang.leetcode.q101_200;

public class Question200_2 {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int row, int column) {
        if (row >= 0 && column >= 0 && row < grid.length && column < grid[0].length && grid[row][column] == '1') {
            grid[row][column] = '2';
            dfs(grid, row + 1, column);
            dfs(grid, row, column + 1);
            dfs(grid, row - 1, column);
            dfs(grid, row, column - 1);
        }
    }
}
