package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentaojiang
 * @date 2019/9/16 10:35 AM
 * @description
 */
public class Question39 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        process(0, candidates, target, list);
        return result;
    }

    private void process(int start, int[] candidates, int target, List<Integer> list) {
        if (0 > target) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(list));
        }
        if (target > 0) {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                target -= candidates[i];
                process(i, candidates, target, list);
                target += candidates[i];
                list.remove(list.size() - 1);
            }
        }
    }

}
