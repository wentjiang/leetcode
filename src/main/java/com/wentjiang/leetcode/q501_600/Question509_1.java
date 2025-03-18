package com.wentjiang.leetcode.q501_600;

import java.util.Enumeration;

public class Question509_1 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    //优化存储
    public int fib1(int n) {
        if (n <= 1) {
            return n;
        }

        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i < n + 1; i++) {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        return num2;
    }

}
