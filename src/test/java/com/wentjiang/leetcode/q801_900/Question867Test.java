package com.wentjiang.leetcode.q801_900;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question867Test {

    private Question867 question867 = new Question867();

    @Test
    public void transpose() {
        Assertions.assertArrayEquals(new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } },
                question867.transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
    }
}