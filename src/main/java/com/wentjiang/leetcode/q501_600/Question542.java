package com.wentjiang.leetcode.q501_600;

import java.util.LinkedList;
import java.util.Queue;

public class Question542 {
    /**
     * 对应元素1到最近的0的距离
     * <p>
     * 多源BFS算法 先将所有的0加入到队列中,对每一个加入队列的元素进行广度优先遍历,遍历出来最终的结果
     *
     * @param mat
     * 
     * @return
     */
    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        int rowNum = mat.length, colNum = mat[0].length;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[] { i, j });
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        int[] rowMove = new int[] { -1, 1, 0, 0 };
        int[] colMove = new int[] { 0, 0, 1, -1 };
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int rowValue = current[0] + rowMove[i];
                int colValue = current[1] + colMove[i];
                if (rowValue < rowNum && colValue < colNum && rowValue >= 0 && colValue >= 0
                        && mat[rowValue][colValue] == -1) {
                    mat[rowValue][colValue] = mat[current[0]][current[1]] + 1;
                    queue.add(new int[] { rowValue, colValue });
                }
            }
        }

        return mat;
    }
}
