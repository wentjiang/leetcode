package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2019/9/21 12:50 PM
 * @description
 */
public class Question67Test {

    private Question67 question67;

    @Before
    public void setUp() throws Exception {
        question67 = new Question67();
    }

    @Test
    public void addBinary() {
        Assert.assertEquals("100",question67.addBinary("11","1"));
    }

    @Test
    public void addBinary2() {
        Assert.assertEquals("10101",question67.addBinary("1010","1011"));
    }
}