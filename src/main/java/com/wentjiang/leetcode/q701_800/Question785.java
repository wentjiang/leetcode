package com.wentjiang.leetcode.q701_800;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question785 {
    private static int NOT_VISIT = 0;
    private static int RED = 1;
    private static int GREEN = -1;

    public boolean isBipartite(int[][] graph) {
        int[] mark = new int[graph.length];
        //广度遍历该图
        for (int i = 0; i < graph.length; i++) {
            if (mark[i] == NOT_VISIT) {
                Queue<Integer> queue = new ArrayDeque<>();
                queue.offer(i);
                mark[i] = RED;
                while (!queue.isEmpty()) {
                    int index = queue.poll();
                    int value = -mark[index];
                    for (int node : graph[index]) {
                        if (mark[node] == NOT_VISIT) {
                            mark[node] = value;
                            queue.offer(node);
                        } else if (mark[node] != value) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
