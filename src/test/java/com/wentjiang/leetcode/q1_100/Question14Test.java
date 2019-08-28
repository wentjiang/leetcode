package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/8/27 7:08 PM
 * @description
 */
public class Question14Test {

    private Question14 question14;

    @Before
    public void setUp() throws Exception {
        question14 = new Question14();
    }

    @Test
    public void longestCommonPrefix1() {
        Assert.assertEquals("fl", question14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void longestCommonPrefix2() {
        Assert.assertEquals("", question14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    public void longestCommonPrefix3() {
        Assert.assertEquals("", question14.longestCommonPrefix(new String[]{}));
    }

    @Test
    public void longestCommonPrefix4() {
        Assert.assertEquals("a", question14.longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    public void longestCommonPrefix5() {
        Assert.assertEquals("c", question14.longestCommonPrefix(new String[]{"c", "c"}));
    }
}