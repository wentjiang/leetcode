package com.wentjiang.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/8/26 9:25 PM
 * @description
 */
public class Question1Test {

    private Question1 question1;

    @Before
    public void before() {
        question1 = new Question1();
    }

    @Test
    public void twoSum() {
        Assert.assertArrayEquals(new int[]{0, 1}, question1.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}