package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/25 7:58 PM
 * 
 * @description
 */
public class Question125Test {

    private Question125 question125;

    @Before
    public void setUp() throws Exception {
        question125 = new Question125();
    }

    @Test
    public void isPalindrome() {
        Assert.assertEquals(true, question125.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void isPalindrome1() {
        Assert.assertEquals(false, question125.isPalindrome("race a car"));
    }

    @Test
    public void isPalindrome2() {
        Assert.assertEquals(false, question125.isPalindrome("0P"));
    }
}