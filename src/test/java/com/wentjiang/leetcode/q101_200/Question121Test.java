package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/19 10:13 AM
 * 
 * @description
 */
public class Question121Test {

    private Question121 question121;

    @Before
    public void setUp() throws Exception {
        question121 = new Question121();
    }

    @Test
    public void maxProfit() {
        Assert.assertEquals(5, question121.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    @Test
    public void maxProfit1() {
        Assert.assertEquals(0, question121.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}