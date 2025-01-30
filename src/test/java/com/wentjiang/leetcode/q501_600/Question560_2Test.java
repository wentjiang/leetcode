package com.wentjiang.leetcode.q501_600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question560_2Test {

    private Question560_2 question560 = new Question560_2();

    @Test
    void subarraySum() {
        int result = question560.subarraySum(new int[]{1, 1, 1}, 2);
        Assertions.assertEquals(2, result);
    }

    @Test
    void subarraySum1() {
        int result = question560.subarraySum(new int[]{1, 2, 3}, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    void subarraySum2() {
        int result = question560.subarraySum(new int[]{-1, -1, 1}, 0);
        Assertions.assertEquals(1, result);
    }

}