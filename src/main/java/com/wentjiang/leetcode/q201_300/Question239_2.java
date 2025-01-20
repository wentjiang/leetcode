package com.wentjiang.leetcode.q201_300;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question239_2 {
    /**
     * 与双端队列相似,使用优先队列作为存储
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return nums[o2] - nums[o1];
            }
        });

        for (int i = 0; i < nums.length; i++) {
            pq.offer(i);
            if (i >= k - 1) {
                while (!pq.isEmpty() && pq.peek() <= i - k) {
                    pq.poll();
                }
                int max = pq.peek();
                result[i - k + 1] = nums[max];
            }
        }
        return result;
    }
}
