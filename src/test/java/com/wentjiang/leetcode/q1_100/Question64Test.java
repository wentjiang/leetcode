package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 3:14 PM
 * 
 * @description
 */
public class Question64Test {

    private Question64 question64;

    @Before
    public void setUp() throws Exception {
        question64 = new Question64();
    }

    @Test
    public void minPathSum() {
        Assert.assertEquals(7, question64.minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
    }
}