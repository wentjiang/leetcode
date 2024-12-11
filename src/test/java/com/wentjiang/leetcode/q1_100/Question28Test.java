package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/11 9:40 AM
 * 
 * @description
 */
public class Question28Test {

    private Question28 question28 = new Question28();

    @Test
    public void strStr() {
        assertEquals(2, question28.strStr2("hello", "ll"));
    }

    @Test
    public void strStr1() {
        assertEquals(-1, question28.strStr("aaaaa", "bba"));
    }

    @Test
    public void strStr2() {
        assertEquals(0, question28.strStr("", ""));
    }

    @Test
    public void strStr3() {
        assertEquals(9, question28.strStr("mississippi", "pi"));
    }

}