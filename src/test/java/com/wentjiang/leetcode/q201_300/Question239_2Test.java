package com.wentjiang.leetcode.q201_300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question239_2Test {

    private Question239_2 question2392 = new Question239_2();

    @Test
    void maxSlidingWindow() {
        int[] result = question2392.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        int[] expect = new int[]{3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(expect, result);
    }
}