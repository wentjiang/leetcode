package com.wentjiang.leetcode.q801_900;

public class Question844_1 {
    public boolean backspaceCompare(String S, String T) {
        return getResult(S).equals(getResult(T));
    }

    public String getResult(String str) {
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == '#') {
                if (result.length() > 0) {
                    result = new StringBuilder(result.substring(0, result.length() - 1));
                }
            } else {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }
}
