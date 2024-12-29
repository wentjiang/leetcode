package com.wentjiang.leetcode.q201_300;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question225 {

}

class MyStack {
    private Queue<Integer> mainQueue;
    private Queue<Integer> sideQueue;

    public MyStack() {
        mainQueue = new ArrayDeque<>();
        sideQueue = new ArrayDeque<>();
    }

    // 将元素先加入 side queue, mainqueue全加入sidequeue,再将sidequeue全放入mainqueue
    public void push(int x) {
        sideQueue.offer(x);
        while (!mainQueue.isEmpty()) {
            sideQueue.offer(mainQueue.poll());
        }
        while (!sideQueue.isEmpty()) {
            mainQueue.offer(sideQueue.poll());
        }
    }

    // 从mainqueue 取第一个元素
    public int pop() {
        return mainQueue.poll();
    }

    public int top() {
        return mainQueue.peek();
    }

    public boolean empty() {
        return mainQueue.isEmpty();
    }

}