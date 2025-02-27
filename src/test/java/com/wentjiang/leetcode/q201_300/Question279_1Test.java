package com.wentjiang.leetcode.q201_300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question279_1Test {

    private Question279_1 question279 = new Question279_1();

    @Test
    void numSquares() {
        Assertions.assertEquals(1, question279.numSquares(1));
    }

    @Test
    void numSquares2() {
        Assertions.assertEquals(2, question279.numSquares(2));
    }

    @Test
    void numSquares3() {
        Assertions.assertEquals(3, question279.numSquares(3));
    }

    @Test
    void numSquares4() {
        Assertions.assertEquals(1, question279.numSquares(4));
    }

    @Test
    void numSquares5() {
        Assertions.assertEquals(2, question279.numSquares(8));
    }

    @Test
    void numSquares6() {
        Assertions.assertEquals(3, question279.numSquares(12));
    }

    @Test
    void numSquares7() {
        Assertions.assertEquals(2, question279.numSquares(13));
    }
}