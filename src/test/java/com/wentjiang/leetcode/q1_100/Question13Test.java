package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.q1_100.Question13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/8/26 8:16 PM
 * 
 * @description
 */
public class Question13Test {

    private Question13 question = new Question13();

    @Test
    public void test1() {
        assertEquals(3, question.romanToInt("III"));
    }

    @Test
    public void test2() {
        assertEquals(4, question.romanToInt("IV"));
    }

    @Test
    public void test3() {
        assertEquals(9, question.romanToInt("IX"));
    }

    @Test
    public void test4() {
        assertEquals(58, question.romanToInt("LVIII"));
    }

    @Test
    public void test5() {
        assertEquals(1994, question.romanToInt("MCMXCIV"));
    }

}
