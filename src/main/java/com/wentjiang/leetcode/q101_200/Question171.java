package com.wentjiang.leetcode.q101_200;

public class Question171 {
    public int titleToNumber(String s) {
        int length = s.length();
        int result = 0;
        int index = 0;
        char[] chars = s.toCharArray();
        while (index < length) {
            char ch = chars[index];
            result += (ch - 'A' + 1) * Math.pow(26, length - index - 1);
            index++;
        }
        return result;
    }
}
