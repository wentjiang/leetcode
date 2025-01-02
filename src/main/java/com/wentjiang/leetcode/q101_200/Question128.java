package com.wentjiang.leetcode.q101_200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question128 {
    /**
     * 将元素值放在hashmap中, key存储数值, value存储当前最长的值
     *
     * @param nums
     * 
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> accessedSet = new HashSet<>();
        int max = 1;
        for (int num : nums) {
            map.put(num, 1);
        }

        for (int num : nums) {
            if (!accessedSet.contains(num)) {
                accessedSet.add(num);
                int count = 1;
                int nextNum = num + 1;
                while (map.containsKey(nextNum)) {
                    int addNum = map.get(nextNum);
                    if (addNum > 1) {
                        map.put(num, count + addNum);
                        max = Math.max(max, map.get(num));
                        break;
                    } else {
                        count++;
                        map.put(num, count);
                        accessedSet.add(nextNum);
                        nextNum++;
                    }
                    max = Math.max(max, map.get(num));
                }
            }
        }

        return max;
    }
}
