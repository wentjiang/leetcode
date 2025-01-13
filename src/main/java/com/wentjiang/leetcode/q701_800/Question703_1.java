package com.wentjiang.leetcode.q701_800;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question703_1 {

}

class KthLargest {

    private PriorityQueue<Integer> priorityQueue;
    private int k;

    public KthLargest(int k, int[] nums) {
        priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        this.k = k;
        for (int num : nums) {
            priorityQueue.offer(num);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
    }

    public int add(int val) {
        priorityQueue.offer(val);
        if (priorityQueue.size() > k) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}