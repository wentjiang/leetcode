package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2019/9/18 9:13 PM
 * @description
 */
public class Question58Test {

    private Question58 question58;

    @Before
    public void setUp() throws Exception {
        question58 = new Question58();
    }

    @Test
    public void lengthOfLastWord() {
        Assert.assertEquals(5,question58.lengthOfLastWord("Hello World"));
    }
}