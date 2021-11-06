package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/4 9:51 AM
 * 
 * @description 暴利破解法,时间复杂度n^3 过长的字符串将不能解析
 */
public class Question5_1 {

    public String longestPalindrome(String s) {
        String result = "";
        if (s == null || s.length() == 0) {
            return result;
        } else {
            result = s.substring(0, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (i + result.length() < s.length()) {
                for (int j = result.length() + 1; j + i <= s.length(); j++) {
                    String temp = s.substring(i, i + j);
                    if (temp.length() > result.length() && isPalindrome(temp)) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String str) {
        if (str.length() == 1) {
            return true;
        }
        char[] chars = str.toCharArray();
        int i = 0;
        while (true) {
            if (i > str.length() / 2) {
                return true;
            }
            if (chars[i] != chars[str.length() - i - 1]) {
                return false;
            }
            i++;
        }
    }
}
