package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2019/11/14 5:16 PM
 * @description
 */
public class Question48 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Question48 question48 = new Question48();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        question48.rotate(matrix);
    }
}
