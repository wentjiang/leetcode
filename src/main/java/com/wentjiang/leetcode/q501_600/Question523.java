package com.wentjiang.leetcode.q501_600;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question523 {
    /**
     * 循环遍历,暴力法 O(n^2)
     */
    public boolean checkSubarraySum1(int[] nums, int k) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 前缀法,issue:there are too many data cause timeout error
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        int shortestLength = 2;
        int[] temps = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            temps[i + 1] = nums[i] + temps[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + shortestLength; j < nums.length + 1; j++) {
                if ((temps[j] - temps[i]) % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * 余数+哈希表方法
     */
    public boolean checkSubarraySum2(int[] nums, int k) {
        Map<Integer, Integer> moduloAndIndex = new HashMap<>();
        moduloAndIndex.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < nums.length; i++) {
            remainder = (remainder + nums[i]) % k;
            if (moduloAndIndex.containsKey(remainder)) {
                int prevIndex = moduloAndIndex.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                moduloAndIndex.put(remainder, i);
            }
        }
        return false;
    }
}
