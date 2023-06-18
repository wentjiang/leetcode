package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question11_3Test {

    private final Question11_3 question11 = new Question11_3();

    @Test
    public void maxArea1() {
        Assertions.assertEquals(49, question11.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    @Test
    public void maxArea2() {
        Assertions.assertEquals(1, question11.maxArea(new int[] { 1, 1 }));
    }

}