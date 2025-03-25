package com.wentjiang.leetcode.q2701_2800;

import java.util.HashSet;
import java.util.Set;

public class Question2711 {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int leftI = i - 1;
                int leftJ = j - 1;
                Set<Integer> leftSet = new HashSet<>();
                while (leftI >= 0 && leftJ >= 0) {
                    leftSet.add(grid[leftI][leftJ]);
                    leftI--;
                    leftJ--;
                }
                int rightI = i + 1;
                int rightJ = j + 1;
                Set<Integer> rightSet = new HashSet<>();
                while (rightI < m && rightJ < n) {
                    rightSet.add(grid[rightI][rightJ]);
                    rightI++;
                    rightJ++;
                }
                int left = leftSet.size();
                int right = rightSet.size();
                result[i][j] = Math.abs(left - right);
            }
        }
        return result;
    }
}
