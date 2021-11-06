package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2020/2/2 9:01 PM
 * 
 * @description
 */
public class Question73 {
    public void setZeroes(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == 0) {
                    xList.add(i);
                    yList.add(j);
                }
            }
        }
        for (Integer xNum : xList) {
            for (int i = 0; i < y; i++) {
                matrix[xNum][i] = 0;
            }
        }
        for (Integer yNum : yList) {
            for (int i = 0; i < x; i++) {
                matrix[i][yNum] = 0;
            }
        }
    }
}
