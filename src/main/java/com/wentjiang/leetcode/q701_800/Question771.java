package com.wentjiang.leetcode.q701_800;

import java.util.HashSet;
import java.util.Set;

public class Question771 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet();
        for (char ch : J.toCharArray()) {
            set.add(ch);
        }
        int num = 0;
        for (char ch : S.toCharArray()) {
            if (set.contains(ch)) {
                num++;
            }
        }
        return num;
    }
}
