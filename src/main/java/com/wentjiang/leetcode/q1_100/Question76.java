package com.wentjiang.leetcode.q1_100;

import java.util.HashMap;
import java.util.Map;

public class Question76 {
    public String minWindow(String s, String t) {
        int len = s.length();
        if (t.length() == 0 || t.length() > s.length()) {
            return "";
        }
        Map<Character, Integer> subMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            subMap.put(ch, subMap.getOrDefault(ch, 0) + 1);
        }

        int first = 0;
        int second = 0;
        int minFirst = 0;
        int minSecond = Integer.MAX_VALUE;
        Map<Character, Integer> allMap = new HashMap<>();

        while (first < len || second < len) {
            //当前长度包含字串的情况
            if (hasAllElement(allMap, subMap)) {
                //包含字串的字符串长度小于之前的长度
                if ((minSecond - minFirst) > (second - first)) {
                    minFirst = first;
                    minSecond = second;
                }
                //去掉最前边的字符
                //前指针向后移动
                changeKeyCount(allMap, subMap, s.charAt(first++), false);
            } else {
                //没有包含全部的情况
                if (second < len) {
                    //后指针向后移动
                    changeKeyCount(allMap, subMap, s.charAt(second++), true);
                } else {
                    break;
                }
            }
        }
        if (minSecond - minFirst == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(minFirst, minSecond);
        }
    }

    public boolean hasAllElement(Map<Character, Integer> allMap, Map<Character, Integer> subMap) {
        for (Character ch : subMap.keySet()) {
            int value = subMap.get(ch);
            Integer subValue = allMap.get(ch);
            if (subValue == null || subValue < value) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param allMap
     * @param key
     * @param increase true 表示增加,false表示减少
     */
    public void changeKeyCount(Map<Character, Integer> allMap, Map<Character, Integer> subMap, Character key, boolean increase) {
        if (subMap.containsKey(key)) {
            if (increase) {
                allMap.put(key, allMap.getOrDefault(key, 0) + 1);
            } else {
                Integer value = allMap.get(key);
                if (value == 1) {
                    allMap.remove(key);
                } else {
                    allMap.put(key, --value);
                }
            }
        }
    }

}
