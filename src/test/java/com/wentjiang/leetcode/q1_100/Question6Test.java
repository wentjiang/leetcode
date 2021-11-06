package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/4 5:37 PM
 * 
 * @description
 */
public class Question6Test {

    private Question6 question6;

    @Before
    public void setUp() throws Exception {
        question6 = new Question6();
    }

    @Test
    public void convert1() {
        Assert.assertEquals("LCIRETOESIIGEDHN", question6.convert("LEETCODEISHIRING", 3));
    }

    @Test
    public void convert2() {
        Assert.assertEquals("LDREOEIIECIHNTSG", question6.convert("LEETCODEISHIRING", 4));
    }
}