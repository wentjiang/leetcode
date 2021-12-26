package com.wentjiang.leetcode.q1001_1100;

import java.util.ArrayList;
import java.util.List;

public class Question1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strs = text.split(" ");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < strs.length - 2; i++) {
            if (strs[i].equals(first) && strs[i + 1].equals(second)) {
                result.add(strs[i + 2]);
            }
        }
        return result.toArray(String[]::new);
    }
}
