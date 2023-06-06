package com.wentjiang.leetcode.practice.day1;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长子串
 */
public class Day1Question2 {

    /**
     * 使用双游标记录前后位置
     */
    public int longestSubString(String originalString) {
        if (originalString.length() == 0 || originalString.length() == 1) {
            return originalString.length();
        }

        int firstIndex = 0;
        int secondIndex = 0;
        int result = 0;
        Set<Character> charSet = new HashSet<>();
        char[] chars = originalString.toCharArray();
        for (char ch : chars) {
            if (!charSet.contains(ch)) {
                charSet.add(ch);
                if (result < charSet.size()) {
                    result = charSet.size();
                }
                secondIndex++;
            } else {
                // 清理无用的字符
                char temp = chars[firstIndex];
                while (firstIndex < secondIndex) {
                    if (temp == ch) {
                        firstIndex++;
                        break;
                    } else {
                        charSet.remove(temp);
                        firstIndex++;
                    }
                }
            }
        }
        return result;
    }

}
