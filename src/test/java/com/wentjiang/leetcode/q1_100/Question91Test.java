package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question91Test {

    private Question91 question91 = new Question91();

    @Test
    void numDecodings() {
        Assertions.assertEquals(2, question91.numDecodings("12"));
    }

    @Test
    void numDecodings1() {
        Assertions.assertEquals(3, question91.numDecodings("226"));
    }
}