package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question343Test {

    private Question343 question343 = new Question343();

    @Test
    void integerBreak() {
        Assertions.assertEquals(1, question343.integerBreak(2));
    }

    @Test
    void integerBreak1() {
        Assertions.assertEquals(36, question343.integerBreak(10));
    }
}