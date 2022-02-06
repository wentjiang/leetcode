package com.wentjiang.leetcode.q1701_1800;

import java.util.HashSet;
import java.util.Set;

public class Question1763 {
    /**
     * 暴力求解
     */
    public String longestNiceSubstring(String s) {
        String result = "";
        if (s.length() < 2) {
            return result;
        }

        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length - 1; i++) {
            for (int j = i + 1; j < chs.length + 1; j++) {
                String subStr = s.substring(i, j);
                if (isNiceString(subStr) && subStr.length() > result.length()) {
                    result = subStr;
                }
            }
        }
        return result;
    }

    private boolean isNiceString(String str) {
        Set<String> set = new HashSet<>();
        char[] chs = str.toCharArray();
        for (char c : chs) {
            set.add(String.valueOf(c));
        }
        for (char c : chs) {
            String tempStr = String.valueOf(c);
            if (!set.contains(tempStr.toLowerCase()) || !set.contains(tempStr.toUpperCase())) {
                return false;
            }
        }
        return true;
    }
}
