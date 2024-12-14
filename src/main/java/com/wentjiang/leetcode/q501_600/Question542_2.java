package com.wentjiang.leetcode.q501_600;

public class Question542_2 {
    /**
     * 对应元素1到最近的0的距离 使用DP方法来解该题目
     *
     * @param mat
     * 
     * @return
     */
    public static int[][] updateMatrix(int[][] mat) {
        int TEMP_VALUE = 10000;
        int rowNum = mat.length, colNum = mat[0].length;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (mat[i][j] != 0) {
                    mat[i][j] = TEMP_VALUE;
                }
            }
        }

        // 从左上角往下计算
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                // 上边
                if (i - 1 >= 0) {
                    mat[i][j] = Math.min(mat[i - 1][j] + 1, mat[i][j]);
                }
                // 左边
                if (j - 1 >= 0) {
                    mat[i][j] = Math.min(mat[i][j - 1] + 1, mat[i][j]);
                }
            }
        }

        // 从右下角往上计算
        for (int i = rowNum - 1; i >= 0; i--) {
            for (int j = colNum - 1; j >= 0; j--) {
                // 下边
                if (i + 1 < rowNum) {
                    mat[i][j] = Math.min(mat[i + 1][j] + 1, mat[i][j]);
                }
                // 右边
                if (j + 1 < colNum) {
                    mat[i][j] = Math.min(mat[i][j + 1] + 1, mat[i][j]);
                }
            }
        }
        return mat;
    }
}
