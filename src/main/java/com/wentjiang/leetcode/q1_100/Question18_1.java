package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentaojiang
 * @date 2019/9/8 10:00 AM
 * @description 有性能问题, 提交之后超时
 */
public class Question18_1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[start], nums[end]);
                        result.add(list);
                        start++;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
            Iterator<List<Integer>> iterator = result.iterator();
            Set<String> set = new HashSet<>();
            while (iterator.hasNext()) {
                List<Integer> list = iterator.next();
                StringBuilder stringBuilder = new StringBuilder();
                list.forEach(stringBuilder::append);
                String string = stringBuilder.toString();
                if (set.contains(string)) {
                    iterator.remove();
                } else {
                    set.add(string);
                }
            }
        }
        return result;
    }
}
