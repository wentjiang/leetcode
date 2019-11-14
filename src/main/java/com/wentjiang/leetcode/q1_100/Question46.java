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
        int n = nums.length;
        for (int num : nums) {
            list.add(num);
        }
        backtrack(n, list, result, 0);
        return result;
    }

    private void backtrack(int n, List<Integer> list, List<List<Integer>> result, int first) {
        if (first == n){
            result.add(new ArrayList<>(list));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(list, first, i);
            backtrack(n, list, result, first + 1);
            Collections.swap(list, first, i);
        }
    }

}
