package com.wentjiang.leetcode.q1301_1400;

public class Question1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] counts = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count += mat[i][j];
            }
            counts[i] = count;
        }
        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < mat.length; j++) {
                if (counts[j] < min) {
                    min = counts[j];
                    minIndex = j;
                }
            }
            counts[minIndex] = Integer.MAX_VALUE;
            results[i] = minIndex;
        }
        return results;
    }
}
