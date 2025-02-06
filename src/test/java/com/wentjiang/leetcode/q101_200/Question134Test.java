package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question134Test {

    private Question134 question134 = new Question134();

    @Test
    void canCompleteCircuit() {
        int result = question134.canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1});
        Assertions.assertEquals(4, result);
    }
}