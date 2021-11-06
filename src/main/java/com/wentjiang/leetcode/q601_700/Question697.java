package com.wentjiang.leetcode.q601_700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question697 {
    public int findShortestSubArray(int[] nums) {
        if (nums.length < 1) {
            return nums.length;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        // 先找到众数
        for (int num : nums) {
            int value = map.getOrDefault(num, 0) + 1;
            map.put(num, value);
            maxCount = Math.max(maxCount, value);
        }

        if (maxCount == 1) {
            return 1;
        }
        List<Integer> maxCountNums = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxCountNums.add(entry.getKey());
            }
        }
        int result = Integer.MAX_VALUE;
        // 找到当前数第一个和最后一个的坐标差值
        for (int num : maxCountNums) {
            int first = 0;
            int last = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    first = i;
                    break;
                }
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == num) {
                    last = i;
                    break;
                }
            }
            result = Math.min(last - first + 1, result);
        }
        return result;
    }
}
