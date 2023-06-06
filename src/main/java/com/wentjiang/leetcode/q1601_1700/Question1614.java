package com.wentjiang.leetcode.q1601_1700;

public class Question1614 {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int depth = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
            case '(':
                depth++;
                maxDepth = Math.max(depth, maxDepth);
                break;
            case ')':
                depth--;
                break;
            default:
                break;
            }
        }
        return maxDepth;
    }
}
