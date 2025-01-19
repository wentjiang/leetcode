package com.wentjiang.leetcode.q301_400;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question373_1 {

    /**
     * 暴力法优化,还是会有性能问题
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < k && i < nums1.length; i++) {
            for (int j = 0; j < k && j < nums2.length; j++) {
                List<Integer> l = new ArrayList<>(2);
                l.add(nums1[i]);
                l.add(nums2[j]);
                result.add(l);
            }
        }

        result.sort(Comparator.comparingInt(l -> l.get(0) + l.get(1)));
        return result.subList(0, k);
    }
}
