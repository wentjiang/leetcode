package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question62_1Test {

    private Question62_1 question62 = new Question62_1();

    @Test
    void uniquePaths() {
        int result = question62.uniquePaths(7, 3);
        Assertions.assertEquals(28, result);
    }

    @Test
    void uniquePaths1() {
        int result = question62.uniquePaths(3, 3);
        Assertions.assertEquals(6, result);
    }
}