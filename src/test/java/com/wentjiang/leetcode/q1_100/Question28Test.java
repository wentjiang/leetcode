package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/11 9:40 AM
 * 
 * @description
 */
public class Question28Test {

    private Question28 question28;

    @Before
    public void setUp() throws Exception {
        question28 = new Question28();
    }

    @Test
    public void strStr() {
        Assert.assertEquals(2, question28.strStr2("hello", "ll"));
    }

    @Test
    public void strStr1() {
        Assert.assertEquals(-1, question28.strStr("aaaaa", "bba"));
    }

    @Test
    public void strStr2() {
        Assert.assertEquals(0, question28.strStr("", ""));
    }

    @Test
    public void strStr3() {
        Assert.assertEquals(9, question28.strStr("mississippi", "pi"));
    }

}