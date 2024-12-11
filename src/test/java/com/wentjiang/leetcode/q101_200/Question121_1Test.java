package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/20 12:05 PM
 * 
 * @description
 */
public class Question121_1Test {

    private Question121_1 question121_1 = new Question121_1();

    @Test
    public void maxProfit() {
        Assertions.assertEquals(5, question121_1.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    @Test
    public void maxProfit1() {
        Assertions.assertEquals(0, question121_1.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}