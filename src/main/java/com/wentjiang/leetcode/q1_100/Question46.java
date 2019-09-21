package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wentao.jiang
 * @date 2019/9/18 8:49 PM
 * @description
 */
public class Question46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        backtrack(nums.length, list, result, 0);
        return result;
    }

    public void backtrack(int n,
                          List<Integer> nums,
                          List<List<Integer>> output,
                          int first) {
        if (n == first) {
            output.add(new ArrayList<>(nums));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(nums, first, i);
            backtrack(n, nums, output, first + 1);
            Collections.swap(nums, first, i);
        }
    }
}
