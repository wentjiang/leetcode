package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/9/15 2:33 PM
 * @description
 */
public class Question35Test {

    private Question35 question35;

    @Before
    public void setUp() throws Exception {
        question35 = new Question35();
    }

    @Test
    public void searchInsert() {
        Assert.assertEquals(2, question35.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void searchInsert1() {
        Assert.assertEquals(1, question35.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void searchInsert2() {
        Assert.assertEquals(4, question35.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    public void searchInsert3() {
        Assert.assertEquals(0, question35.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }


}