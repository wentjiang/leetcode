package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2019/11/15 10:10 AM
 * @description
 */
public class Question55Test {

    private Question55 question55;

    @Before
    public void setUp() throws Exception {
        question55 = new Question55();
    }

    @Test
    public void canJump1() {
        Assert.assertTrue(question55.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void canJump2() {
        Assert.assertFalse(question55.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void canJump3(){
        Assert.assertFalse(question55.canJump(new int[]{2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4
            ,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,
            5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6}));
    }
}