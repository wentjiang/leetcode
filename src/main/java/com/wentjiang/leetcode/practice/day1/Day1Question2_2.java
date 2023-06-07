package com.wentjiang.leetcode.practice.day1;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长子串
 */
public class Day1Question2_2 {

    /**
     * 使用双游标记录前后位置
     */
    public int longestSubString(String originalString) {
        if (originalString.length() == 0 || originalString.length() == 1) {
            return originalString.length();
        }
        int firstIndex = 0;
        int result = 0;
        Set<Character> charSet = new HashSet<>();
        char[] chars = originalString.toCharArray();
        for (int i = 0;i< chars.length;i++) {
            if (!charSet.contains(chars[i])) {
                charSet.add(chars[i]);
                if (result < charSet.size()) {
                    result = charSet.size();
                }
            } else {
                // 清理无用的字符
                while (firstIndex < i) {
                    if (chars[firstIndex] == chars[i]) {
                        firstIndex++;
                        break;
                    } else {
                        charSet.remove(chars[firstIndex]);
                        firstIndex++;
                    }
                }
            }
        }
        return result;
    }

}
