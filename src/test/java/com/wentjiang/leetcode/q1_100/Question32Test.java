package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/9 6:10 PM
 * 
 * @description
 */
public class Question32Test {

    private Question32 question32 = new Question32();

    @Test
    public void longestValidParentheses() {
        assertEquals(2, question32.longestValidParentheses("(()"));
    }

    @Test
    public void longestValidParentheses1() {
        assertEquals(4, question32.longestValidParentheses(")()())"));
    }
}