package com.wentjiang.leetcode.q201_300;

import java.util.HashMap;
import java.util.Map;

public class Question242 {

    /**
     * 放在map中
     *
     * @param s
     * @param t
     * 
     * @return
     */
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            Integer count = map.get(ch);
            if (count == null) {
                return false;
            } else if (count == 1) {
                map.remove(ch);
            } else {
                map.put(ch, count - 1);
            }
        }
        return map.isEmpty();
    }

    /**
     * 放在数组中
     */

    public boolean isAnagram1(String s, String t) {
        int[] array = new int[26];
        for (char ch : s.toCharArray()) {
            array[ch - 'a'] = array[ch - 'a'] + 1;
        }
        for (char ch : t.toCharArray()) {
            array[ch - 'a'] = array[ch - 'a'] - 1;
        }
        int count0 = 0;
        for (int a : array) {
            if (a == 0) {
                count0++;
            }
        }
        return count0 == 26;
    }
}
