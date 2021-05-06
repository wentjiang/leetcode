package com.wentjiang.leetcode.q1701_1800;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question1720Test {

    private Question1720 question1720 = new Question1720();

    @Test
    public void decode() {
        Assertions.assertArrayEquals(new int[]{1, 0, 2, 1}, question1720.decode(new int[]{1, 2, 3}, 1));
    }
}