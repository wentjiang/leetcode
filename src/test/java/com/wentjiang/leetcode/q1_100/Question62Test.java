package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 3:02 PM
 * 
 * @description
 */
public class Question62Test {

    private Question62 question62 = new Question62();

    @Test
    public void uniquePaths() {
        assertEquals(3, question62.uniquePaths(3, 2));
    }

    @Test
    public void uniquePaths1() {
        assertEquals(28, question62.uniquePaths(3, 7));
    }
}