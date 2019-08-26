package com.wentjiang.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wentaojiang
 * @date 2019/2/24 5:28 PM
 * @description
 */
public class Question3 {
    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int header = 0;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (set.contains(currentChar)) {
                for (int start = header; start < i; start++) {
                    if (chars[start] == currentChar) {
                        header = start + 1;
                        break;
                    } else {
                        set.remove(chars[start]);
                    }
                }
            } else {
                set.add(currentChar);
                if ((i - header + 1) > longest) {
                    longest = i - header + 1;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
}
//"abcabcbb"