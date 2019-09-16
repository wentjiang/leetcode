package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentaojiang
 * @date 2019/9/16 5:54 PM
 * @description
 */
public class Question40 {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return result;
        }
        Arrays.sort(candidates);
        List<Integer> currentList = new ArrayList<>();
        process(0, candidates, target, currentList);
        return result;
    }

    private void process(int start, int[] candidates, int target, List<Integer> currentList) {
        if (target == 0) {
            result.add(new ArrayList<>(currentList));
        }
        if (!(target < 0 || start == candidates.length)) {
            for (int i = start; i < candidates.length; i++) {
                int num = target - candidates[i];
                if (num < 0 || (i > start && candidates[i - 1] == candidates[i])) {
                    continue;
                }
                currentList.add(candidates[i]);
                process(i + 1, candidates, num, currentList);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}
