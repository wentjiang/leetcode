package com.wentjiang.leetcode.q901_1000;

import java.util.HashMap;
import java.util.Map;

public class Question914 {
    public boolean hasGroupsSizeX(int[] deck) {
        // 先确定最小重复数量
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int minRepeat = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minRepeat = Math.min(entry.getValue(), minRepeat);
        }
        if (minRepeat < 2) {
            return false;
        }
        int num = map.size();
        for (int i = 2; i <= minRepeat; i++) {
            int temp = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() % i == 0) {
                    temp += 1;
                }
            }
            if (temp == num) {
                return true;
            }
        }
        return false;
    }
}
