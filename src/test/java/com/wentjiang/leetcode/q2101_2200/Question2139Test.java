package com.wentjiang.leetcode.q2101_2200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question2139Test {
    private Question2139 question2139 = new Question2139();

    @Test
    public void case1() {
        int result = question2139.minMoves(5, 0);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void case2() {
        int result = question2139.minMoves(19, 2);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void case3() {
        int result = question2139.minMoves(10, 4);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void case4() {
        int result = question2139.minMoves(1000000000, 0);
        Assertions.assertEquals(999999999, result);
    }
}