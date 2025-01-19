package com.wentjiang.leetcode.q301_400;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Question373_2 {
    /**
     * 使用优先队列进行求解
     *
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<int[]> queue = new PriorityQueue<>(k, (o1, o2) -> nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]]);

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            queue.offer(new int[]{i, 0});
        }

        while (k-- > 0 && !queue.isEmpty()) {
            int[] pair = queue.poll();
            List<Integer> t = new ArrayList<>(2);
            t.add(nums1[pair[0]]);
            t.add(nums2[pair[1]]);
            result.add(t);
            if (pair[1] + 1 < nums2.length) {
                queue.offer(new int[]{pair[0], pair[1] + 1});
            }
        }
        return result;
    }
}
