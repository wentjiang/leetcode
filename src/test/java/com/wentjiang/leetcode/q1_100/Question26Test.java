package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wentaojiang
 * @date 2019/9/10 2:07 PM
 * @description
 */
public class Question26Test {

    private Question26 question26;
    @Before
    public void setUp() throws Exception {
        question26 = new Question26();
    }

    @Test
    public void removeDuplicates() {
        Assert.assertEquals(2,question26.removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    public void removeDuplicates1() {
        Assert.assertEquals(5,question26.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}