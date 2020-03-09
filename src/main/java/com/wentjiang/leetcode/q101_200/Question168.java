package com.wentjiang.leetcode.q101_200;

public class Question168 {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            int last = (n - 1) % 26;
            n = (n - 1) / 26;
            str.insert(0, (char) ('A' + last));
        }
        return str.toString();
    }
}
