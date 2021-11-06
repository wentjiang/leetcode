package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/8/30 8:34 AM
 * 
 * @description
 */
public class Question16Test {
    private Question16 question16;

    @Before
    public void setUp() throws Exception {
        question16 = new Question16();
    }

    @Test
    public void threeSumClosest1() {
        Assert.assertEquals(2, question16.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
    }

    @Test
    public void threeSumClosest2() {
        Assert.assertEquals(0, question16.threeSumClosest(new int[] { 0, 2, 1, -3 }, 0));
    }

    @Test
    public void threeSumClosest3() {
        Assert.assertEquals(0, question16.threeSumClosest(new int[] { 0, 2, 1, -3 }, 1));
    }
}