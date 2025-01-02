package com.wentjiang.leetcode.q301_400;

import java.util.HashMap;
import java.util.Map;

public class Question383_1 {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (map.containsKey(ch)) {
                Integer count = map.get(ch);
                if (count == null) {
                    return false;
                } else if (count == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, count - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
