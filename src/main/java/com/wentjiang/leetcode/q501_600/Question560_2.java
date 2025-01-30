package com.wentjiang.leetcode.q501_600;

import java.util.HashMap;
import java.util.Map;

public class Question560_2 {
    /**
     * 前缀和+hash表优化, 用hash表统计当前前缀和出现的次数,之前出现过 pre-k的次数,即为 为k的count
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
