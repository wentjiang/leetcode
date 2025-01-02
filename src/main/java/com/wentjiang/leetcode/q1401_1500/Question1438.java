package com.wentjiang.leetcode.q1401_1500;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question1438 {

    /**
     * 使用2个单调队列, 一个从高到低排序, 一个从低到高排序 每次来一个新元素,插入两个队列, 如果最高减最低 大于k的情况, 根据情况将两个队列的元素出队,直到小于k, 记录队列中最长的长度为结果.
     *
     * @param nums
     * @param limit
     * 
     * @return
     */
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> maxQueue = new ArrayDeque<>();
        Deque<Integer> minQueue = new ArrayDeque<>();

        int max = 0;
        int left = 0, right = 0;

        while (right < nums.length) {

            // 大头队列, 队首是当前队列中最大的元素,依次递减
            while (!maxQueue.isEmpty() && maxQueue.peekLast() < nums[right]) {
                maxQueue.pollLast();
            }
            // 小头队列, 队首是当前队列中最小的元素,依次递减
            while (!minQueue.isEmpty() && minQueue.peekLast() > nums[right]) {
                minQueue.pollLast();
            }

            maxQueue.offerLast(nums[right]);
            minQueue.offerLast(nums[right]);

            while (!minQueue.isEmpty() && !maxQueue.isEmpty() && maxQueue.peekFirst() - minQueue.peekFirst() > limit) {
                if (minQueue.peekFirst() == nums[left]) {
                    minQueue.pollFirst();
                }
                if (maxQueue.peekFirst() == nums[left]) {
                    maxQueue.pollFirst();
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
