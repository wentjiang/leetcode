package com.wentjiang.leetcode.q201_300;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question239_1 {

    /**
     * 使用双端队列, 左边的大,右边的小 队列中存放索引 新的元素进来时, 如果小于队尾的元素, 将队尾出队列,直到不小于当前元素, 如果队头的元素的索引已经超了范围,则将队头出队列
     *
     * @param nums
     * @param k
     * 
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            if (queue.isEmpty()) {
                queue.offerLast(i);
            } else {
                while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                    queue.pollLast();
                }
                queue.offerLast(i);
            }
        }

        for (int i = k; i < nums.length; i++) {
            result[i - k] = nums[queue.peekFirst()];
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.pollLast();
            }
            queue.offerLast(i);
            while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
                queue.pollFirst();
            }
            queue.offerLast(i);
        }
        result[nums.length - k] = nums[queue.peekFirst()];
        return result;
    }
}
