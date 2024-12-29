package com.wentjiang.leetcode.q1_100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question42_3 {

    /**
     * 接雨水
     * <p>
     * 使用单调栈, 栈内存储索引, 索引既能计算宽度, 又能通过数组得到高度. 如果当前值的高度比栈顶的高度相等或高,则出栈, 在对比栈顶的元素, 当前高度减去 计算的高度为出栈的元素和栈顶元素的较小值
     * 宽度为当前索引减去当前栈顶索引再减1
     *
     * @param height
     * 
     * @return
     */
    public int trap(int[] height) {
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                int currentIndex = stack.pop();
                if (!stack.isEmpty()) {
                    int leftIndex = stack.peek();
                    int h = Math.min(height[leftIndex], height[i]) - height[currentIndex];
                    int w = i - leftIndex - 1;
                    sum += h * w;
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return sum;
    }
}
