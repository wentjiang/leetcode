package com.wentjiang.leetcode.q801_900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        if (s.length() < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        int num = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                if (num >= 3) {
                    result.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
        }
        return result;
    }
}
