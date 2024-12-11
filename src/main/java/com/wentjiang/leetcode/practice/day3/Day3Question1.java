package com.wentjiang.leetcode.practice.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day3Question1 {
    // 遍历过的节点放在set中
    private final Set<String> accessed = new HashSet<>();
    // 当前的图是否被包围
    private boolean isSurrounded = true;
    private final List<Integer[]> currentGraphNodes = new ArrayList<>();

    // 如果遇到O,使用广度优先遍历所有的,如果所有的点都被包围,所有的值都修改.
    public String[][] question(String[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                boolean needTraverse = !"X".equals(arrays[i][j]) && !accessed.contains(i + "_" + j)
                        && "O".equals(arrays[i][j]);
                if (needTraverse) {
                    isSurrounded = true;
                    currentGraphNodes.clear();
                    dfs(arrays, i, j);
                    if (isSurrounded) {
                        for (Integer[] currentNode : currentGraphNodes) {
                            arrays[currentNode[0]][currentNode[1]] = "X";
                        }
                    }
                }
            }
        }
        return arrays;
    }

    private void dfs(String[][] arrays, int i, int j) {
        accessed.add(i + "_" + j);
        currentGraphNodes.add(new Integer[] { i, j });
        if (i == 0 || j == 0 || i + 1 == arrays.length || j + 1 == arrays[0].length) {
            isSurrounded = false;
        }
        if (i + 1 < arrays.length && !accessed.contains((i + 1) + "_" + j) && "O".equals(arrays[i + 1][j])) {
            dfs(arrays, i + 1, j);
        }
        if (i - 1 > 0 && !accessed.contains((i - 1) + "_" + j) && "O".equals(arrays[i - 1][j])) {
            dfs(arrays, i - 1, j);
        }
        if (j + 1 < arrays[0].length && !accessed.contains(i + "_" + (j + 1)) && "O".equals(arrays[i][j + 1])) {
            dfs(arrays, i, j + 1);
        }
        if (j - 1 > 0 && !accessed.contains(i + "_" + (j - 1)) && "O".equals(arrays[i][j - 1])) {
            dfs(arrays, i, j - 1);
        }
    }
}
