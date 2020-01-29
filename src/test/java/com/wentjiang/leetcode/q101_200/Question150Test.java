package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2020/1/29 10:33 PM
 * @description
 */
public class Question150Test {

    private Question150 question150;

    @Before
    public void setUp() throws Exception {
        question150 = new Question150();
    }

    @Test
    public void evalRPN() {
        Assert.assertEquals(9, question150.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    public void evalRPN1() {
        Assert.assertEquals(6, question150.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    public void evalRPN2() {
        Assert.assertEquals(22, question150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

}