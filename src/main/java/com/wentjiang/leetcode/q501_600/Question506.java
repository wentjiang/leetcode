package com.wentjiang.leetcode.q501_600;

import java.util.*;

public class Question506 {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }
        list.sort((o1, o2) -> o2 - o1);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }
        String[] strs = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int order = map.get(score[i]);
            String s = null;
            if (order == 0) {
                s = "Gold Medal";
            } else if (order == 1) {
                s = "Silver Medal";
            } else if (order == 2) {
                s = "Bronze Medal";
            } else {
                s = String.valueOf(order + 1);
            }
            strs[i] = s;
        }
        return strs;
    }
}
