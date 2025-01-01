package com.wentjiang.leetcode.q201_300;

import java.util.HashSet;
import java.util.Set;

public class Question217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
