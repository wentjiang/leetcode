package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/8 10:44 AM
 * 
 * @description
 */
public class Question18_2 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> temp = new ArrayList<>(2);
                temp.add(nums[i]);
                temp.add(nums[j]);
                list.add(temp);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); i++) {
                int sum = list.get(i).stream().mapToInt(t -> t).sum();
                sum += list.get(j).stream().mapToInt(t -> t).sum();
                if (sum == target) {

                }
            }
        }
        return result;
    }
}
