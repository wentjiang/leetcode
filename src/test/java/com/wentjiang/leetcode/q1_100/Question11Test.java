package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/5 3:13 PM
 * 
 * @description
 */
public class Question11Test {

    private Question11_1 question11 = new Question11_1();

    @Test
    public void maxArea1() {
        assertEquals(49, question11.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    @Test
    public void maxArea2() {
        assertEquals(1, question11.maxArea(new int[] { 1, 1 }));
    }
}