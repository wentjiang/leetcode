package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 3:14 PM
 * 
 * @description
 */
public class Question64Test {

    private Question64 question64 = new Question64();

    @Test
    public void minPathSum() {
        assertEquals(7, question64.minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
    }
}