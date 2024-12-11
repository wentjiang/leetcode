package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question172Test {

    private Question172 question172 = new Question172();

    @Test
    public void trailingZeroes() {
        assertEquals(0, question172.trailingZeroes(3));
    }

    @Test
    public void trailingZeroes1() {
        assertEquals(1, question172.trailingZeroes(5));
    }

}