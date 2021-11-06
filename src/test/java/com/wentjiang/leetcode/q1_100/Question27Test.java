package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/10 3:04 PM
 * 
 * @description
 */
public class Question27Test {

    private Question27 question27;

    @Before
    public void setUp() throws Exception {
        question27 = new Question27();
    }

    @Test
    public void removeElement() {
        Assert.assertEquals(2, question27.removeElement(new int[] { 3, 2, 2, 3 }, 3));
    }

    @Test
    public void removeElement1() {
        Assert.assertEquals(5, question27.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }

}