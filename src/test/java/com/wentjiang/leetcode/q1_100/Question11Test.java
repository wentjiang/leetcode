package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/9/5 3:13 PM
 * @description
 */
public class Question11Test {

    private Question11 question11;

    @Before
    public void setUp() throws Exception {
        question11 = new Question11();
    }

    @Test
    public void maxArea1() {
        Assert.assertEquals(49, question11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void maxArea2() {
        Assert.assertEquals(1, question11.maxArea(new int[]{1, 1}));
    }
}