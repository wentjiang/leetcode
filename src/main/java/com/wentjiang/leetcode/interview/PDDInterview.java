package com.wentjiang.leetcode.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PDDInterview {

    /**
     * 数组中找到不同数字的子串,长度为k的子串,要求该子串的和最大且不重复. 如果没有返回0
     *
     * @param nums
     * @param k
     * 
     * @return
     */

    public static int process(int[] nums, int k) {
        Map<Integer, Integer> currentMap = new HashMap<>();
        int max = 0;
        if (nums.length < k) {
            return max;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            currentMap.put(i, nums[i]);
            sum += nums[i];
        }
        Set<Integer> currentSet = new HashSet<>(currentMap.values());
        if (currentSet.size() == k && sum > max) {
            max = sum;
        }
        for (int i = k; i < nums.length; i++) {
            currentMap.put(i, nums[i]);
            currentMap.remove(i - k);
            if (new HashSet<>(currentMap.values()).size() == k && sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
