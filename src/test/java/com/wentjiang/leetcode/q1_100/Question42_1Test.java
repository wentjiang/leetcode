package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question42_1Test {
    private Question42_1 question_42 = new Question42_1();

    @Test
    public void trap() {
        assertEquals(6, question_42.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
    }

    @Test
    public void trap1() {
        assertEquals(1, question_42.trap(new int[] { 4, 2, 3 }));
    }

    @Test
    public void trap2() {
        assertEquals(1, question_42.trap(new int[] { 5, 4, 1, 2 }));
    }
}