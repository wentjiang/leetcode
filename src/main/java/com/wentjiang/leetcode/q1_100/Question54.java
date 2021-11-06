package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2020/2/11 9:36 PM
 * 
 * @description todo
 */
public class Question54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        boolean left = true;
        boolean down = false;
        boolean right = false;
        boolean up = false;
        int leftLimit = 0;
        int topLimit = 0;
        int bottomLimit = matrix.length - 1;
        int rightLimit = matrix[0].length - 1;
        return result;
    }
}
