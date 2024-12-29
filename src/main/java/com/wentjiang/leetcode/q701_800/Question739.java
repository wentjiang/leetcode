package com.wentjiang.leetcode.q701_800;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question739 {
    /**
     * 单调栈 栈内存索引
     * 
     * @param temperatures
     * 
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        Deque<Integer> stack = new ArrayDeque<>();
        int length = temperatures.length;
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int preIndex = stack.pop();
                result[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return result;
    }
}
