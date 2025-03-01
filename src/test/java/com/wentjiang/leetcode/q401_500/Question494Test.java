package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question494Test {

    private Question494 question494 = new Question494();

    @Test
    void findTargetSumWays() {
        int result = question494.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    void findTargetSumWays1() {
        int result = question494.findTargetSumWays(new int[]{1}, 1);
        Assertions.assertEquals(1, result);
    }
}