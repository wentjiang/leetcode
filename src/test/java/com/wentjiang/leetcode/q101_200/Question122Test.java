package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2019/10/20 12:31 PM
 * @description
 */
public class Question122Test {

    private Question122 question122;

    @Before
    public void setUp() throws Exception {
        question122 = new Question122();
    }

    @Test
    public void maxProfit() {
        Assert.assertEquals(7, question122.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }


    @Test
    public void maxProfit1() {
        Assert.assertEquals(4, question122.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void maxProfit2() {
        Assert.assertEquals(0, question122.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}