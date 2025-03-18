package com.wentjiang.leetcode.q1101_1200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1137Test {

    private Question1137 question1137 = new Question1137();

    @Test
    void tribonacci() {
        int result = question1137.tribonacci(4);
        Assertions.assertEquals(4, result);
    }

    @Test
    void tribonacci1() {
        int result = question1137.tribonacci(25);
        Assertions.assertEquals(1389537, result);
    }
}