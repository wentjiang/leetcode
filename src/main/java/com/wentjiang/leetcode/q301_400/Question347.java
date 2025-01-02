package com.wentjiang.leetcode.q301_400;

import java.util.*;

public class Question347 {

    /**
     * 放在Hashmap中
     *
     * @param nums
     * @param k
     * 
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[k];
        List<Integer> integers = map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .map(Map.Entry::getKey).toList().subList(0, k);

        for (int i = 0; i < k; i++) {
            result[i] = integers.get(i);
        }
        return result;
    }

    public int[] topKFrequent1(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (queue.size() == k && queue.peek()[1] < value) {
                queue.poll();
            }
            queue.add(new int[] { entry.getKey(), entry.getValue() });
        }

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll()[0];
        }

        return result;
    }
}
