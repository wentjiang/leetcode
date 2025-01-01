package com.wentjiang.leetcode.q101_200;

import java.util.HashSet;
import java.util.Set;

public class Question128_1 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {
            //此处有优化,如果不是第一个起始的直接忽略
            if (!set.contains(num - 1)) {
                int currentValue = num;
                int count = 1;
                while (set.contains(++currentValue)) {
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
