package com.wentjiang.leetcode.q201_300;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question239 {
    /**
     * 维护一个长度为k的队列,滑动窗口得最大值就是队列里的最大值. 46 / 51 超时错误
     * 
     * @param nums
     * @param k
     * 
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        int currentMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() < k) {
                currentMax = Math.max(currentMax, nums[i]);
                queue.offer(nums[i]);
            } else {
                result[i - k] = currentMax;
                int pollValue = queue.poll();
                queue.offer(nums[i]);
                // 如果新来的比当前的最大值大,不用重新计算最大值
                if (nums[i] > currentMax) {
                    currentMax = nums[i];
                } else {
                    // 如果队列中出的是最大值,重新计算
                    if (currentMax == pollValue) {
                        // 重新计算
                        int count = 0;
                        currentMax = Integer.MIN_VALUE;
                        for (int j = 0; j < k; j++) {
                            int t = queue.poll();
                            currentMax = Math.max(currentMax, t);
                            queue.offer(t);
                        }
                    }
                }

            }
        }
        result[nums.length - k] = currentMax;
        return result;
    }
}
