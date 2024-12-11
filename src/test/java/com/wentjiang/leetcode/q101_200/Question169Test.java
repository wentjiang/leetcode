package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/3 9:38 PM
 * 
 * @description
 */
public class Question169Test {

    private Question169 question_169 = new Question169();

    @Test
    public void majorityElement() {
        assertEquals(2, question_169.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

    @Test
    public void majorityElement1() {
        assertEquals(3, question_169.majorityElement(new int[] { 3, 2, 3 }));
    }
}