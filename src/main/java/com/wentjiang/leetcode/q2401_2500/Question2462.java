package com.wentjiang.leetcode.q2401_2500;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question2462 {
    /**
     * 使用优先队列存储costs, 队列中先存放前后的candidates个元素, 使用前后索引表示添加的元素的位置,将元素添加到优先队列,每次取cost最小的元素,统计cost的总数
     *
     * @param costs
     * @param k
     * @param candidates
     * @return
     */
    public long totalCost(int[] costs, int k, int candidates) {
        long sum = 0L;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer index1, Integer index2) {
                if (costs[index2] > costs[index1]) {
                    return -1;
                } else if (costs[index2] == costs[index1]) {
                    return index1 - index2;
                } else {
                    return 1;
                }
            }
        });
        int firstIndex = candidates - 1;
        int secondIndex = costs.length - candidates;

        //初始化优先队列
        if (firstIndex + 1 < secondIndex) {
            //只放前边的candidates个和后边的candidates个数据
            for (int i = 0; i < candidates; i++) {
                pq.add(i);
                pq.add(costs.length - candidates + i);
            }
        } else {
            //全部都放在队列中
            for (int i = 0; i < costs.length; i++) {
                pq.offer(i);
            }
        }
        while (k > 0) {
            int index = pq.poll();
            int value = costs[index];
            if (firstIndex + 1 < secondIndex) {
                if (index <= firstIndex) {
                    firstIndex++;
                    pq.offer(firstIndex);
                } else if (index >= secondIndex) {
                    secondIndex--;
                    pq.offer(secondIndex);
                }
            }

            sum += value;

            k--;
        }

        return sum;
    }
}
