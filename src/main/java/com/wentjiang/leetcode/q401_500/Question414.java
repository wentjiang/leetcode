package com.wentjiang.leetcode.q401_500;

import java.util.Comparator;
import java.util.TreeSet;

public class Question414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o2 > o1) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (int num : nums) {
            treeSet.add(num);
        }
        int max = treeSet.pollFirst();
        treeSet.pollFirst();
        Integer result = treeSet.pollFirst();
        return result == null ? max : result;
    }
}
