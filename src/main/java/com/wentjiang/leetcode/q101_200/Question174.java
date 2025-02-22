package com.wentjiang.leetcode.q101_200;

public class Question174 {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int originalValue = dungeon[i][j];
                if (i + 1 < m && j + 1 < n) {
                    dungeon[i][j] = Math.min(dungeon[i + 1][j], dungeon[i][j + 1]);
                } else {
                    if (i + 1 < m) {
                        dungeon[i][j] = dungeon[i + 1][j];
                    }
                    if (j + 1 < n) {
                        dungeon[i][j] = dungeon[i][j + 1];
                    }
                    if (i + 1 == m && j + 1 == n) {
                        dungeon[i][j] = 1;
                    }
                }

                dungeon[i][j] -= originalValue;

                if (dungeon[i][j] <= 0) {
                    dungeon[i][j] = 1;
                }
            }
        }
        return dungeon[0][0];
    }
}
