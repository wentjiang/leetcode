package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/7 12:13 AM
 * 
 * @description
 */
public class Question42Test {

    private Question42 question_42;

    @Before
    public void setUp() throws Exception {
        question_42 = new Question42();
    }

    @Test
    public void trap() {
        Assert.assertEquals(6, question_42.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
    }

    @Test
    public void trap1() {
        Assert.assertEquals(1, question_42.trap(new int[] { 4, 2, 3 }));
    }

    @Test
    public void trap2() {
        Assert.assertEquals(1, question_42.trap(new int[] { 5, 4, 1, 2 }));
    }
}