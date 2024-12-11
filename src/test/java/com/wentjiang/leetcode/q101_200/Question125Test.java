package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/25 7:58 PM
 * 
 * @description
 */
public class Question125Test {

    private Question125 question125 = new Question125();

    @Test
    public void isPalindrome() {
        assertTrue(question125.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void isPalindrome1() {
        assertFalse(question125.isPalindrome("race a car"));
    }

    @Test
    public void isPalindrome2() {
        assertFalse(question125.isPalindrome("0P"));
    }
}