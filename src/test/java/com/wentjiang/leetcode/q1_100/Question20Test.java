package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/2 1:50 PM
 * 
 * @description
 */
public class Question20Test {

    private Question20 question20 = new Question20();

    @Test
    public void isValid1() {
        assertTrue(question20.isValid("()"));
    }

    @Test
    public void isValid2() {
        assertTrue(question20.isValid("()[]{}"));
    }

    @Test
    public void isValid3() {
        assertFalse(question20.isValid("(]"));
    }

    @Test
    public void isValid4() {
        assertFalse(question20.isValid("([)]"));
    }

    @Test
    public void isValid5() {
        assertTrue(question20.isValid("{[]}"));
    }

    @Test
    public void isValid6() {
        assertFalse(question20.isValid("["));
    }

}