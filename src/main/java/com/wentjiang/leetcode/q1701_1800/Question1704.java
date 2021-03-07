package com.wentjiang.leetcode.q1701_1800;

import java.util.HashSet;
import java.util.Set;

public class Question1704 {
    public boolean halvesAreAlike(String s) {
        Set<Character> chars = new HashSet<>();
        chars.add('a');
        chars.add('e');
        chars.add('i');
        chars.add('o');
        chars.add('u');
        chars.add('A');
        chars.add('E');
        chars.add('I');
        chars.add('O');
        chars.add('U');
        int helf = s.length() / 2;
        int firstCount = 0;
        int secondCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                if (i < helf) {
                    firstCount++;
                } else if (i >= helf) {
                    secondCount++;
                }
            }
        }
        return firstCount == secondCount;
    }
}
