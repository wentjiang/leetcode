package com.wentjiang.leetcode.q1401_1500;

public class Question1486 {
    public int xorOperation(int n, int start) {
        int temp;
        int result = start;
        for (int i = 1; i < n; i++) {
            temp = start + 2 * i;
            result = result ^ temp;
        }
        return result;
    }
}
