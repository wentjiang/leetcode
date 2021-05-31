package com.wentjiang.leetcode.q301_400;

public class Question342 {
    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n != 1) {
            if (n % 4 != 0) {
                return false;
            } else {
                n = n / 4;
            }
        }
        return true;
    }
}
