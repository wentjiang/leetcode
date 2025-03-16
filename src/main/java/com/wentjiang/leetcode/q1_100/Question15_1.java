package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question15_1 {

    //暴力法
    public List<List<Integer>> threeSum(int[] nums) {
        Set<String> resultSet = new HashSet<>();
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                        result.sort(Integer::compareTo);
                        String resultStr = result.toString();
                        if (!resultSet.contains(result.toString())) {
                            resultSet.add(resultStr);
                            results.add(result);
                        }
                    }
                }
            }
        }
        return results;
    }

    //排序再暴力


    //前后指针法
}
