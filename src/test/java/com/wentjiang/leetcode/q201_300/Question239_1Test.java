package com.wentjiang.leetcode.q201_300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question239_1Test {

    private Question239_1 question239 = new Question239_1();

    @Test
    void maxSlidingWindow() {
        Assertions.assertArrayEquals(new int[] { 3, 3, 5, 5, 6, 7 },
                question239.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3));
    }

    @Test
    void maxSlidingWindow1() {
        Assertions.assertArrayEquals(new int[] { 1 }, question239.maxSlidingWindow(new int[] { 1 }, 1));
    }

    @Test
    void maxSlidingWindow2() {
        Assertions.assertArrayEquals(new int[] { 1, -1 }, question239.maxSlidingWindow(new int[] { 1, -1 }, 1));
    }
}