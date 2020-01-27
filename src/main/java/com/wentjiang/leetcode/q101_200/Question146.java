package com.wentjiang.leetcode.q101_200;

import java.util.*;

/**
 * @author wentao.jiang
 * @date 2020/1/27 9:16 AM
 * @description lrucache
 */
public class Question146 {
    static class LRUCache {
        private Map<Integer, Integer> keyValue;
        private LinkedHashSet<Integer> keySet;
        private int capacity;
        private int currentNum = 0;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            keyValue = new HashMap<>(capacity * 2);
            keySet = new LinkedHashSet<>();
        }

        public int get(int key) {
            Integer value = keyValue.get(key);
            if (value == null) {
                return -1;
            }
            if (keySet.isEmpty()) {
                keySet.add(key);
            } else {
                keySet.remove(key);
                keySet.add(key);
            }
            return value;
        }

        public void put(int key, int value) {
            if (currentNum < capacity && keyValue.get(key) == null) {
                currentNum++;
                keyValue.put(key, value);
                keySet.add(key);
            } else {
                if (keyValue.get(key) == null) {
                    int removeKey = keySet.iterator().next();
                    keySet.remove(removeKey);
                    keyValue.remove(removeKey);
                } else {
                    keySet.remove(key);
                    keySet.add(key);
                }
                keyValue.put(key, value);
                keySet.add(key);
            }
        }
    }
}
