package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/8/27 7:07 PM
 * @description
 */
public class Question14 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        char tempCh;
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (minLength > str.length()) {
                minLength = str.length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            tempCh = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != tempCh) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(tempCh);
        }

        return "";
    }

}
