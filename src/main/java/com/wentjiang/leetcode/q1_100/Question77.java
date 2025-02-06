package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.List;

public class Question77 {
    /**
     * 使用排列穷举法
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int count = (int) Math.pow(2, n);
        int i = 0;
        while (i < count) {
            if (Integer.bitCount(i) == k) {
                String s = Integer.toBinaryString(i);
                String sb = "0".repeat(Math.max(0, n - s.length())) + s;
                char[] chars = sb.toCharArray();
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == '1') {
                        temp.add(j + 1);
                    }
                }
                result.add(temp);
            }
            i++;
        }
        return result;
    }
}
