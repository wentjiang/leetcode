package com.wentjiang.leetcode.q201_300;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Question264_1 {
    /**
     * 使用优先级队列, 穷举所有符合规则的丑数,直到访问到n
     * 
     * @param n
     * 
     * @return
     */
    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        set.add(1L);
        int uglyNumber = 1;
        int[] factors = new int[] { 2, 3, 5 };
        for (int i = 0; i < n; i++) {
            uglyNumber = queue.poll().intValue();
            for (int factor : factors) {
                long newValue = (long) factor * uglyNumber;
                if (set.add(newValue)) {
                    queue.add(newValue);
                }
            }
        }
        return uglyNumber;
    }
}
