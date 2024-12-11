package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/14 10:05 AM
 * 
 * @description
 */
public class Question34Test {

    private Question34 question34 = new Question34();

    @Test
    public void searchRange() {
        assertArrayEquals(new int[] { 3, 4 }, question34.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
    }

    @Test
    public void searchRange1() {
        assertArrayEquals(new int[] { -1, -1 }, question34.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
    }
}