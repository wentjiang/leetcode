package com.wentjiang.leetcode.q901_1000;

import java.util.HashSet;
import java.util.Set;

/**
 * 并查集
 */
public class Question947 {
    /**
     * 使用并查集求解,一个相同的集合只保留一个
     *
     * @param stones
     * @return
     */
    public int removeStones(int[][] stones) {
        UnionFind unionFind = new UnionFind(stones.length);
        for (int i = 0; i < stones.length; i++) {
            for (int j = i; j < stones.length; j++) {
                int[] s1 = stones[i];
                int[] s2 = stones[j];
                if (s1[0] == s2[0] || s1[1] == s2[1]) {
                    unionFind.union(i, j);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < stones.length; i++) {
            set.add(unionFind.find(i));
        }
        return stones.length - set.size();
    }

    class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void union(int index1, int index2) {
            int parent1 = find(index1);
            int parent2 = find(index2);
            if (parent1 != parent2) {
                if (parent1 < parent2) {
                    parent[parent2] = parent1;
                } else {
                    parent[parent1] = parent2;
                }
            }
        }

        public int find(int index) {
            //还没有找到根节点
            if (index != parent[index]) {
                int parentIndex = find(parent[parent[index]]);
                parent[index] = parentIndex;
                return parentIndex;
            } else {
                return index;
            }

        }
    }
}
