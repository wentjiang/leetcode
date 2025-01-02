package com.wentjiang.leetcode.q301_400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question350 {

    /**
     * 使用hashmap保存结果, key为数值, value为出现的次数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();

        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int count1 = map1.get(key);
                int count2 = map2.get(key);
                int count = Math.min(count1, count2);
                for (int i = 0; i < count; i++) {
                    result.add(key);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
