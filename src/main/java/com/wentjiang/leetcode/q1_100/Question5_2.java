package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/4 11:02 AM
 * 
 * @description
 */
public class Question5_2 {

    public String longestPalindrome(String s) {
        String result = "";
        if (s == null || s.length() == 0) {
            return result;
        } else {
            result = s.substring(0, 1);
        }
        for (int i = 0; i + result.length() / 2 < s.length(); i++) {
            // 右边是否可扩展
            boolean extendRigth = true;
            // 左边是否可扩展
            boolean extendLeft = true;
            // 先扩展右边
            boolean currentRight = true;
            boolean nowRight = true;
            int start = i;
            int end = i + 1;
            while (extendRigth || extendLeft) {
                if (currentRight) {
                    end = end + 1;
                    currentRight = false;
                } else {
                    start = start - 1;
                    currentRight = true;
                }

                if (start >= 0 && end <= s.length()) {
                    String temp = s.substring(start, end);
                    if (isPalindrome(temp)) {
                        extendRigth = true;
                        extendLeft = true;
                        if (temp.length() > result.length()) {
                            result = temp;
                        }
                    } else {
                        if (nowRight) {
                            extendRigth = false;
                            nowRight = false;
                        } else {
                            extendLeft = false;
                            nowRight = true;
                        }
                    }
                } else {
                    extendLeft = false;
                    extendRigth = false;
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
