package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/9/6 9:05 PM
 * @description
 */
public class Question12Test {

    private Question12 question12;

    @Before
    public void setUp() throws Exception {
        question12 = new Question12();
    }

    @Test
    public void intToRoman1() {
        Assert.assertEquals("III", question12.intToRoman(3));
    }

    @Test
    public void intToRoman2() {
        Assert.assertEquals("IV", question12.intToRoman(4));
    }

    @Test
    public void intToRoman3() {
        Assert.assertEquals("IX", question12.intToRoman(9));
    }

    @Test
    public void intToRoman4() {
        Assert.assertEquals("LVIII", question12.intToRoman(58));
    }

    @Test
    public void intToRoman5() {
        Assert.assertEquals("MCMXCIV", question12.intToRoman(1994));
    }
}