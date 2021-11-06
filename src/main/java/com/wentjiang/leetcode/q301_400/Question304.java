package com.wentjiang.leetcode.q301_400;

public class Question304 {

}

class NumMatrix {

    private int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}

class NumMatrix1 {

    private int[][] sumMatrix;

    public NumMatrix1(int[][] matrix) {
        if (matrix.length == 0) {
            sumMatrix = new int[][] {};
        } else {
            int rowLength = matrix.length;
            int colLength = matrix[0].length;
            sumMatrix = new int[rowLength + 1][colLength + 1];
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        return 0;
    }
}