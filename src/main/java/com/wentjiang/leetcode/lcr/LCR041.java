package com.wentjiang.leetcode.lcr;

import java.util.ArrayDeque;
import java.util.Queue;

public class LCR041 {
    static class MovingAverage {

        private final int size;
        private int sum;
        private final Queue<Integer> queue;

        /**
         * Initialize your data structure here.
         */
        public MovingAverage(int size) {
            this.size = size;
            sum = 0;
            queue = new ArrayDeque<>(size);
        }

        public double next(int val) {
            if (queue.size() == size) {
                sum -= queue.poll();
            }
            sum += val;
            queue.add(val);
            return (double) sum / queue.size();
        }
    }
}

