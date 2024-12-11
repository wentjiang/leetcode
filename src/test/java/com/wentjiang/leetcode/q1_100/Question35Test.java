package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/15 2:33 PM
 * 
 * @description
 */
public class Question35Test {

    private Question35 question35 = new Question35();

    @Test
    public void searchInsert() {
        assertEquals(2, question35.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    }

    @Test
    public void searchInsert1() {
        assertEquals(1, question35.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }

    @Test
    public void searchInsert2() {
        assertEquals(4, question35.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

    @Test
    public void searchInsert3() {
        assertEquals(0, question35.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
    }

}