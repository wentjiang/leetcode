package com.wentjiang.leetcode.q801_900;

public class Question867 {
    public int[][] transpose(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0][0];
        }
        int lineNum = matrix.length;
        int rowNum = matrix[0].length;
        int[][] result = new int[rowNum][lineNum];
        for (int i = 0; i < lineNum; i++) {
            for (int j = 0; j < rowNum; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
