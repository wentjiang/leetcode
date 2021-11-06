package com.wentjiang.leetcode.q1_100;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author wentaojiang
 * 
 * @date 2019/8/27 7:07 PM
 * 
 * @description
 */
public class Question14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        char tempCh;
        int minLength = Stream.of(strs).min(Comparator.comparingInt(String::length)).get().length();
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

        return stringBuilder.toString();
    }

}
