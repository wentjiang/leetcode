package com.wentjiang.leetcode.q2401_2500;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question2462 {
    /**
     * 使用优先队列存储costs, 队列中先存放前后的candidates个元素, 使用前后索引表示添加的元素的位置,将元素添加到优先队列,每次取cost最小的元素,统计cost的总数
     *
     * @param costs
     * @param k
     * @param candidates
     * @return
     */
    public long totalCost(int[] costs, int k, int candidates) {
        long sum = 0L;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        if (costs.length < candidates) {

        }
        return sum;
    }
}
