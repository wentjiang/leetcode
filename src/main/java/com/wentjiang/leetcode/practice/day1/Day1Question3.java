package com.wentjiang.leetcode.practice.day1;

//最短路径和
public class Day1Question3 {

    // 用一张额外的二维数组表记录当前节点的最短距离
    public int getShortestPath(int[][] grid) {
        int result = 0;
        int rowNum = grid.length;
        int columnNum = grid[0].length;
        int[][] shortestPath = new int[rowNum][columnNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                if (i == 0 && j == 0) {
                    shortestPath[i][j] = grid[i][j];
                } else if (i == 0) {
                    shortestPath[i][j] = grid[i][j] + shortestPath[i][j - 1];
                } else if (j == 0) {
                    shortestPath[i][j] = grid[i][j] + shortestPath[i - 1][j];
                } else {
                    shortestPath[i][j] = grid[i][j] + Math.min(shortestPath[i - 1][j], shortestPath[i][j - 1]);
                }
            }
        }
        return shortestPath[rowNum - 1][columnNum - 1];
    }
}
