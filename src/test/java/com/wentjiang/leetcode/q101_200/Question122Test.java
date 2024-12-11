package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/20 12:31 PM
 * 
 * @description
 */
public class Question122Test {

    private Question122 question122 = new Question122();

    @Test
    public void maxProfit() {
        assertEquals(7, question122.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    @Test
    public void maxProfit1() {
        assertEquals(4, question122.maxProfit(new int[] { 1, 2, 3, 4, 5 }));
    }

    @Test
    public void maxProfit2() {
        assertEquals(0, question122.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}