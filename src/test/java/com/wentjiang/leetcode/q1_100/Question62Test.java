package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 3:02 PM
 * 
 * @description
 */
public class Question62Test {

    private Question62 question62;

    @Before
    public void setUp() throws Exception {
        question62 = new Question62();
    }

    @Test
    public void uniquePaths() {
        Assert.assertEquals(3, question62.uniquePaths(3, 2));
    }

    @Test
    public void uniquePaths1() {
        Assert.assertEquals(28, question62.uniquePaths(3, 7));
    }
}