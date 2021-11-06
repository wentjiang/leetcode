package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/25 5:28 PM
 * 
 * @description
 */
public class Question125 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        int head = 0;
        int tail = chars.length - 1;
        while (head < tail) {
            if (!isCommonChar(chars[head])) {
                head++;
                continue;
            }
            if (!isCommonChar(chars[tail])) {
                tail--;
                continue;
            }
            if (chars[head] == chars[tail]
                    || isChar(chars[head]) && isChar(chars[tail]) && Math.abs(chars[head] - chars[tail]) == 32) {
                head++;
                tail--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isCommonChar(char ch) {
        return isNumber(ch) || isChar(ch);
    }

    public boolean isNumber(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    public boolean isChar(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
