package com.wentjiang.leetcode.q501_600;

import java.util.HashMap;
import java.util.Map;

public class Question567 {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        // 当前缓存的map
        Map<Character, Integer> subMap = new HashMap<>();
        // 目标map
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            int value = targetMap.getOrDefault(s1.charAt(i), 0);
            targetMap.put(s1.charAt(i), ++value);
        }
        int index = 0;
        int count = 0;
        while (index < s2.length()) {
            // 判断有没有包含全部
            char currentCh = s2.charAt(index);
            if (!targetMap.containsKey(currentCh)) {
                index++;
                subMap.clear();
                count = 0;
            } else if (count < len) {
                index++;
                count++;
                int value = subMap.getOrDefault(currentCh, 0);
                subMap.put(currentCh, ++value);
            }
            // 如果长度相等,判断是否全包含,不全包含向后移动
            if (count == len) {
                // 包含全部,返回true
                if (containsAll(subMap, targetMap)) {
                    return true;
                } else {
                    // 去掉第一位的字符
                    count--;
                    char ch = s2.charAt(index - len);
                    int value = subMap.get(ch);
                    if (value == 0) {
                        subMap.remove(ch);
                    } else {
                        subMap.put(ch, --value);
                    }
                }
            }
        }

        return false;
    }

    public boolean containsAll(Map<Character, Integer> subMap, Map<Character, Integer> targetMap) {
        for (char ch : targetMap.keySet()) {
            if (subMap.get(ch) == null || targetMap.get(ch).intValue() != subMap.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
