package com.wentjiang.leetcode.lcr;

import java.util.ArrayDeque;
import java.util.Deque;

public class LCR184 {
}

/**
 * 由于每个操作都需要o(1)的时间复杂度, add 和 remove都是直接的操作,不用考虑,
 * 对于get_max, o1的复杂度需要引入额外的数据结构,如果是树或者优先队列,不能保证查询或者插入的时候是o1,这里可以使用大头队列
 */
class Checkout {

    private Deque<Integer> maxQueue;
    private Deque<Integer> values;

    public Checkout() {
        maxQueue = new ArrayDeque<>();
        values = new ArrayDeque<>();
    }

    public int get_max() {
        if (maxQueue.isEmpty()) {
            return -1;
        } else {
            return maxQueue.peek();
        }
    }

    public void add(int value) {
        values.offer(value);
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
            maxQueue.pollLast();
        }
        maxQueue.offer(value);
    }

    public int remove() {
        if (!values.isEmpty()) {
            int val = values.poll();
            if (!maxQueue.isEmpty() && maxQueue.peek() == val) {
                maxQueue.poll();
            }
            return val;
        } else {
            return -1;
        }
    }
}
