package com.wentjiang.leetcode.q201_300;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question209_1 {
    /**
     * 使用队列加和, 如果不到target的长度就增加,如果超过了就减少
     */
    public int minSubArrayLen(int target, int[] nums) {
        Queue<Integer> queue = new ArrayDeque<>();
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num;
            queue.offer(num);
            while (sum >= target) {
                result = Math.min(result, queue.size());
                int temp = queue.poll();
                sum -= temp;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
