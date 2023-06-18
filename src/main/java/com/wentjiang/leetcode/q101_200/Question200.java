package com.wentjiang.leetcode.q101_200;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question200 {

    public int numIslands(char[][] grid) {
        int count = 0;
        Queue<Integer[]> queue = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    queue.add(new Integer[] { i, j });
                    grid[i][j] = '2';
                    while (queue.size() > 0) {
                        int size = queue.size();
                        for (int k = 0; k < size; k++) {
                            Integer[] nums = queue.poll();
                            // 下边
                            if (nums[0] + 1 < grid.length && grid[nums[0] + 1][nums[1]] == '1') {
                                queue.add(new Integer[] { nums[0] + 1, nums[1] });
                                grid[nums[0] + 1][nums[1]] = '2';
                            }
                            // 右边
                            if (nums[1] + 1 < grid[0].length && grid[nums[0]][nums[1] + 1] == '1') {
                                queue.add(new Integer[] { nums[0], nums[1] + 1 });
                                grid[nums[0]][nums[1] + 1] = '2';
                            }
                            // 上边
                            if (nums[0] - 1 >= 0 && grid[nums[0] - 1][nums[1]] == '1') {
                                queue.add(new Integer[] { nums[0] - 1, nums[1] });
                                grid[nums[0] - 1][nums[1]] = '2';
                            }
                            // 左边
                            if (nums[1] - 1 >= 0 && grid[nums[0]][nums[1] - 1] == '1') {
                                queue.add(new Integer[] { nums[0], nums[1] - 1 });
                                grid[nums[0]][nums[1] - 1] = '2';
                            }
                        }
                    }
                    count++;
                }
            }
        }

        return count;
    }
}
