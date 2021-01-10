package com.wentjiang.leetcode.q201_300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question228 {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 1) {
            return Collections.singletonList(String.valueOf(nums[0]));
        }
        List<String> result = new ArrayList<>();
        String start = null;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length) {
                if (nums[i] != nums[i + 1] - 1) {
                    if (start == null) {
                        result.add(String.valueOf(nums[i]));
                    } else {
                        result.add(start + "->" + nums[i]);
                        start = null;
                    }
                } else {
                    if (start == null) {
                        start = String.valueOf(nums[i]);
                    }
                }
            } else {
                if (nums[i] == nums[i - 1] + 1) {
                    result.add(start + "->" + nums[i]);
                } else {
                    result.add(String.valueOf(nums[i]));
                }
            }
        }
        return result;
    }
}
