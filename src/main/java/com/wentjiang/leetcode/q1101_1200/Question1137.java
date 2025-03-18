package com.wentjiang.leetcode.q1101_1200;

public class Question1137 {
    public int tribonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            int temp = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = temp;
        }
        return num3;
    }
}
