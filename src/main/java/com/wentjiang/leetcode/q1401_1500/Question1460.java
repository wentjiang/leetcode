package com.wentjiang.leetcode.q1401_1500;

import java.util.Map;

public class Question1460 {
    // 将target数组放入hashmap中,比较arr中的元素是否都在target中
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> targetMap = new java.util.HashMap<>();
        for (int i : target) {
            targetMap.put(i, targetMap.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (targetMap.containsKey(i)) {
                targetMap.put(i, targetMap.get(i) - 1);
                if (targetMap.get(i) == 0) {
                    targetMap.remove(i);
                }
            } else {
                return false;
            }
        }
        return targetMap.isEmpty();
    }
}
