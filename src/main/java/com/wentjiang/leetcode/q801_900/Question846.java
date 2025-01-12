package com.wentjiang.leetcode.q801_900;

import java.util.TreeMap;

public class Question846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int h : hand) {
            treeMap.put(h, treeMap.getOrDefault(h, 0) + 1);
        }
        int currentValue = treeMap.firstKey();
        int g = groupSize;
        for (int i = 0; i < hand.length; i++) {
            if (g == groupSize) {
                currentValue = treeMap.firstKey();
            } else {
                currentValue = currentValue + 1;
            }
            Integer count = treeMap.get(currentValue);

            if (count == null || count == 0) {
                return false;
            } else if (count == 1) {
                treeMap.remove(currentValue);
            } else {
                treeMap.put(currentValue, treeMap.get(currentValue) - 1);
            }
            g--;
            if (g == 0) {
                g = groupSize;
            }
        }

        return true;
    }
}
