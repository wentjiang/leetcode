package com.wentjiang.leetcode.q101_200;

import java.util.HashSet;
import java.util.Set;

public class Question200_1 {
    /**
     * 使用并查集求解
     */
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int n = grid.length * grid[0].length;
        int l = grid[0].length;
        UnionFind unionFind = new UnionFind(n);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int index = i * l + j;
                unionFind.initValue(index, index);
                if (grid[i][j] == '0') {
                    unionFind.initValue(index, -1);
                } else {
                    if (i - 1 >= 0 && grid[i - 1][j] == '1') {
                        int index2 = (i - 1) * l + j;
                        unionFind.union(index, index2);
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == '1') {
                        int index2 = i * l + j - 1;
                        unionFind.union(index, index2);
                    }
                }
            }
        }

        return unionFind.count();
    }

    class UnionFind {
        int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
        }

        public void initValue(int index, int value) {
            parent[index] = value;
        }

        public int count(){
            Set<Integer> set = new HashSet<>();
            for(int num: parent){
                if (num != -1) {
                    set.add(find(num));
                }
            }
            return set.size();
        }

        public void union(int num1, int num2) {
            int index1 = find(num1);
            int index2 = find(num2);
            if (index1 != index2) {
                if (index1 < index2) {
                    parent[index2] = index1;
                } else {
                    parent[index1] = index2;
                }
            }
        }

        public int find(int num) {
            if (num == parent[num]) {
                return num;
            } else {
                return find(parent[num]);
            }
        }
    }
}
