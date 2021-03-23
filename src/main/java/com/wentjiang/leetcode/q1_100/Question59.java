package com.wentjiang.leetcode.q1_100;

public class Question59 {
    public int[][] generateMatrix(int n) {
        int max = (int) Math.pow(n, 2);
        int[][] result = new int[n][n];
        int i = 0;
        int j = 0;
        //方向 0 向右 1 向下 2 向左 3 向上
        int direction = 0;
        for (int index = 0; index < max; index++) {
            result[i][j] = index + 1;
            //向右
            if (direction == 0) {
                //换方向的情况
                if (j == n - 1 || result[i][j + 1] != 0) {
                    direction = 1;
                    i++;
                } else {
                    j++;
                }
                continue;
            }
            //向下
            if (direction == 1) {
                if (i == n - 1 || result[i + 1][j] != 0) {
                    direction = 2;
                    j--;
                } else {
                    i++;
                }
                continue;
            }
            //向左
            if (direction == 2) {
                if (j == 0 || result[i][j - 1] != 0) {
                    direction = 3;
                    i--;
                } else {
                    j--;
                }
                continue;
            }

            //向上
            if (direction == 3) {
                if (i == 0 || result[i - 1][j] != 0) {
                    direction = 0;
                    j++;
                } else {
                    i--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Question59 question59 = new Question59();
        System.out.println(question59.generateMatrix(4).toString());
    }
}
