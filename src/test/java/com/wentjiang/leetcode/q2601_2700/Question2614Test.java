package com.wentjiang.leetcode.q2601_2700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2614Test {

    private Question2614 question2614 = new Question2614();

    @Test
    void diagonalPrime() {
        int result = question2614.diagonalPrime(new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}});
        Assertions.assertEquals(11, result);
    }
}