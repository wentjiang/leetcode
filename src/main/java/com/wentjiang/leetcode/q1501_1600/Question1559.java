package com.wentjiang.leetcode.q1501_1600;

public class Question1559 {
    public boolean containsCycle(char[][] grid) {
        if (grid.length == 0) {
            return false;
        }
        int y = grid.length;
        int x = grid[0].length;

        UnionFind unionFind = new UnionFind(x * y);
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                int index = i * x + j;
                //向下判断
                if (i + 1 < y && grid[i][j] == grid[i + 1][j]) {
                    int index2 = (i + 1) * x + j;
                    boolean result = unionFind.unionAndReturnSameParent(index, index2);
                    if (result) {
                        return true;
                    }
                }
                //向右判断
                if (j + 1 < x && grid[i][j] == grid[i][j + 1]) {
                    int index2 = i * x + j + 1;
                    boolean result = unionFind.unionAndReturnSameParent(index, index2);
                    if (result) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    class UnionFind {

        private final int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public boolean unionAndReturnSameParent(int index1, int index2) {
            int p1 = find(index1);
            int p2 = find(index2);
            if (p1 < p2) {
                parent[p2] = p1;
            } else {
                parent[p1] = p2;
            }
            return p1 == p2;
        }

        private int find(int index) {
            if (index != parent[index]) {
                index = find(parent[index]);
                parent[index] = index;
            }
            return index;
        }

    }
}
