package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question174Test {

    private Question174 question174 = new Question174();

    @Test
    void calculateMinimumHP() {
        int result = question174.calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}});
        Assertions.assertEquals(7, result);
    }

        @Test
    void calculateMinimumHP1() {
        int result = question174.calculateMinimumHP(new int[][]{{0}});
        Assertions.assertEquals(1, result);
    }
}