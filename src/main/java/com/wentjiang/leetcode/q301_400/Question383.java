package com.wentjiang.leetcode.q301_400;

import java.util.HashMap;
import java.util.Map;

public class Question383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = transformStirng2Map(magazine);
        for (char ch : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) <= 0) {
                return false;
            } else {
                magazineMap.put(ch, magazineMap.get(ch) - 1);
            }
        }

        return true;
    }

    private Map<Character, Integer> transformStirng2Map(String magazine) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }
        return result;
    }

}
