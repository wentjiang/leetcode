package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentaojiang
 * @date 2019/9/8 10:00 AM
 * @description 时间还是比较慢
 */
public class Question18_1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        String key = nums[i] + "-" + nums[j] + "-" + nums[start] + "-" + nums[end];
                        if (set.contains(key)) {
                            start++;
                        } else {
                            set.add(key);
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[start], nums[end]);
                            result.add(list);
                            start++;
                        }
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
