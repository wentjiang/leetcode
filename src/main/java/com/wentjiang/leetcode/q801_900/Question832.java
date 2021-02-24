package com.wentjiang.leetcode.q801_900;

public class Question832 {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A.length == 0) {
            return A;
        }
        int rowNum = A.length;
        int length = A[0].length;
        int helf = length % 2 == 0 ? length / 2 : length / 2 + 1;
        for (int j = 0; j < rowNum; j++) {
            for (int i = 0; i < helf; i++) {
                int temp = Math.abs(A[j][i] - 1);
                A[j][i] = Math.abs(A[j][length - i - 1] - 1);
                A[j][length - i - 1] = temp;
            }
        }
        return A;
    }
}
