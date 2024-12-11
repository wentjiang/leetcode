package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/4 7:44 PM
 * 
 * @description question8
 */
public class Question8Test {

    private Question8 question8 = new Question8();

    @Test
    public void myAtoi1() {
        assertEquals(42, question8.myAtoi("42"));
    }

    @Test
    public void myAtoi2() {
        assertEquals(-42, question8.myAtoi("   -42"));
    }

    @Test
    public void myAtoi3() {
        assertEquals(4193, question8.myAtoi("4193 with words"));
    }

    @Test
    public void myAtoi4() {
        assertEquals(0, question8.myAtoi("words and 987"));
    }

    @Test
    public void myAtoi5() {
        assertEquals(-2147483648, question8.myAtoi("-91283472332"));
    }

    @Test
    public void myAtoi6() {
        assertEquals(0, question8.myAtoi("+"));
    }

    @Test
    public void myAtoi7() {
        assertEquals(0, question8.myAtoi("+-2"));
    }

    @Test
    public void myAtoi8() {
        assertEquals(12345678, question8.myAtoi("  0000000000012345678"));
    }

    @Test
    public void myAtoi9() {
        assertEquals(1, question8.myAtoi("+1"));
    }

    @Test
    public void myAtoi10() {
        assertEquals(-1, question8.myAtoi("-000000000000001"));
    }

    @Test
    public void myAtoi11() {
        assertEquals(-5, question8.myAtoi("-5-"));
    }

    @Test
    public void myAtoi12() {
        assertEquals(0, question8.myAtoi("    0000000000000   "));
    }

    @Test
    public void myAtoi13() {
        assertEquals(123, question8.myAtoi("123-"));
    }

    @Test
    public void myAtoi14() {
        assertEquals(0, question8.myAtoi("0-1"));
    }

}