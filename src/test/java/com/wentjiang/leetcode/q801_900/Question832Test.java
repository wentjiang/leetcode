package com.wentjiang.leetcode.q801_900;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question832Test {

    private Question832 question832 = new Question832();

    @Test
    public void flipAndInvertImage() {
        Assertions.assertArrayEquals(new int[][] { { 1, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 1, 0 } },
                question832.flipAndInvertImage(
                        new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } }));
    }
}