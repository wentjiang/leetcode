package com.wentjiang.leetcode;

/**
 * @author wentaojiang
 * @date 2019/4/8 8:33 PM
 * @description
 */
public class Question9 {
    public boolean isPalindrome(int x) {
        String sx = String.valueOf(x);
        char[] chs = sx.toCharArray();
        for (int i = 0; i < sx.length() / 2 + 1; i++) {
            if (chs[i] != chs[sx.length() - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
