package com.wentjiang.leetcode.practice.q_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question_100_1Test {

    private Question_100_1 question = new Question_100_1();

    @Test
    public void case1() {
        int result = question
                .expressStation(new int[][] { { 1, 1, 1, 1 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 0, 0, 1 }, });
        Assertions.assertEquals(1, result);
    }

    @Test
    public void case2() {
        int result = question
                .expressStation(new int[][] { { 1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, });
        Assertions.assertEquals(3, result);
    }

}