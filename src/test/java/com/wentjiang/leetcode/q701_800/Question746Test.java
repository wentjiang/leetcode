package com.wentjiang.leetcode.q701_800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question746Test {

    private Question746 question746 = new Question746();

    @Test
    void minCostClimbingStairs() {
        int result = question746.minCostClimbingStairs(new int[]{10, 15, 20});
        Assertions.assertEquals(15, result);
    }

    @Test
    void minCostClimbingStairs1() {
        int result = question746.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        Assertions.assertEquals(6, result);
    }
}