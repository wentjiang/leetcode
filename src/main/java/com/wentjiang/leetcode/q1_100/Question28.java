package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/11 9:40 AM
 * @description
 */
public class Question28 {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle) || "".equals(needle)) {
            return 0;
        }
        char[] originalChars = haystack.toCharArray();
        char[] targetChars = needle.toCharArray();
        for (int i = 0; i < (originalChars.length - targetChars.length + 1); i++) {
            for (int j = 0; j < targetChars.length; j++) {
                if (originalChars[i + j] != targetChars[j]) {
                    break;
                }
                if (j == targetChars.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        if (haystack.equals(needle) || "".equals(needle)) {
            return 0;
        }
        for (int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
