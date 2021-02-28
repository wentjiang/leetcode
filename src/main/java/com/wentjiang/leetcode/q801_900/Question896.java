package com.wentjiang.leetcode.q801_900;

public class Question896 {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 1) {
            return true;
        }
        boolean increase = true;
        boolean decrease = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                decrease = false;
            }
            if (A[i] > A[i + 1]) {
                increase = false;
            }
            if (!increase && !decrease) {
                return false;
            }
        }
        return increase || decrease;
    }
}
