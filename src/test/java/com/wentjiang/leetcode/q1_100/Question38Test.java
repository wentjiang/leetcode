package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/9/16 10:15 AM
 * @description
 */
public class Question38Test {

    private Question38 question38;

    @Before
    public void setUp() throws Exception {
        question38 = new Question38();
    }

    @Test
    public void countAndSay() {
        Assert.assertEquals("1",question38.countAndSay(1));
    }

    @Test
    public void countAndSay1() {
        Assert.assertEquals("1211",question38.countAndSay(4));
    }
}