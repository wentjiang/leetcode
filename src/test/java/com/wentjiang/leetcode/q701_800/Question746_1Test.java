package com.wentjiang.leetcode.q701_800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question746_1Test {

    private Question746_1 question746 = new Question746_1();

    @Test
    void minCostClimbingStairs() {
        int result = question746.minCostClimbingStairs(new int[]{10, 15, 20});
        Assertions.assertEquals(15, result);
    }

}