package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/9/18 9:13 PM
 * 
 * @description
 */
public class Question58Test {

    private Question58 question58 = new Question58();

    @Test
    public void lengthOfLastWord() {
        assertEquals(5, question58.lengthOfLastWord("Hello World"));
    }
}