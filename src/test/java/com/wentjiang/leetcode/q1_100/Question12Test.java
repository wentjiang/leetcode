package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/6 9:05 PM
 * 
 * @description
 */
public class Question12Test {

    private Question12 question12 = new Question12();

    @Test
    public void intToRoman1() {
        assertEquals("III", question12.intToRoman(3));
    }

    @Test
    public void intToRoman2() {
        assertEquals("IV", question12.intToRoman(4));
    }

    @Test
    public void intToRoman3() {
        assertEquals("IX", question12.intToRoman(9));
    }

    @Test
    public void intToRoman4() {
        assertEquals("LVIII", question12.intToRoman(58));
    }

    @Test
    public void intToRoman5() {
        assertEquals("MCMXCIV", question12.intToRoman(1994));
    }
}