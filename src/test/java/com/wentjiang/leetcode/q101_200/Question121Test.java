package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/19 10:13 AM
 * 
 * @description
 */
public class Question121Test {

    private Question121 question121 = new Question121();

    @Test
    public void maxProfit() {
        Assertions.assertEquals(5, question121.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    @Test
    public void maxProfit1() {
        Assertions.assertEquals(0, question121.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}