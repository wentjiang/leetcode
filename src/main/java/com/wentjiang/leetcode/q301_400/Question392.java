package com.wentjiang.leetcode.q301_400;

public class Question392 {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }
}
