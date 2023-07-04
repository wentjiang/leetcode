package com.wentjiang.leetcode.practice.q_100;

import java.util.*;

public class Question_100_1 {

    public int expressStation(int[][] graph) {
        Set<Integer> unaccessedSet = new HashSet<>();
        int count = 0;

        for (int i = 0; i < graph.length; i++) {
            unaccessedSet.add(i);
        }
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = i; j < graph.length; j++) {
                if (graph[i][j] == 1){

                }
            }
        }

        return 0;
    }
}
