package com.wentjiang.leetcode.q1001_1100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1020Test {

    private Question1020 question1020 = new Question1020();

    @Test
    void numEnclaves() {
        Assertions.assertEquals(3, question1020
                .numEnclaves(new int[][] { { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 } }));
    }

    @Test
    void numEnclaves1() {
        Assertions.assertEquals(0, question1020
                .numEnclaves(new int[][] { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } }));
    }

    @Test
    void numEnclaves2() {
        Assertions.assertEquals(0, question1020.numEnclaves(new int[][] { { 0 }, { 1 }, { 1 }, { 0 }, { 0 } }));
    }
}