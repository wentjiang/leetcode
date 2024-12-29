package com.wentjiang.leetcode.q901_1000;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question933 {


}

class RecentCounter {
    private final Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}