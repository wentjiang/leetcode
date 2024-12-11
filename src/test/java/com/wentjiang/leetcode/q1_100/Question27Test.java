package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/10 3:04 PM
 * 
 * @description
 */
public class Question27Test {

    private Question27 question27 = new Question27();

    @Test
    public void removeElement() {
        assertEquals(2, question27.removeElement(new int[] { 3, 2, 2, 3 }, 3));
    }

    @Test
    public void removeElement1() {
        assertEquals(5, question27.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }

}