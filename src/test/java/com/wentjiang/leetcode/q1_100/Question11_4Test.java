package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question11_4Test {
    private final Question11_4 question11 = new Question11_4();

    @Test
    public void maxArea1() {
        Assertions.assertEquals(49, question11.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    @Test
    public void maxArea2() {
        Assertions.assertEquals(1, question11.maxArea(new int[] { 1, 1 }));
    }
}