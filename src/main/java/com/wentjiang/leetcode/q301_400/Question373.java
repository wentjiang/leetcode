package com.wentjiang.leetcode.q301_400;

import java.util.*;

public class Question373 {
    /**
     * 暴力法求解
     *
     * @param nums1
     * @param nums2
     * @param k
     * 
     * @return
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                List<Integer> l = new ArrayList<>(2);
                l.add(num1);
                l.add(num2);
                result.add(l);
            }
        }
        result.sort(Comparator.comparingInt(l -> l.get(0) + l.get(1)));
        return result.subList(0, k);
    }

}
