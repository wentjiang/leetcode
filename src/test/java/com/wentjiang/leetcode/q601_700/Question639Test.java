package com.wentjiang.leetcode.q601_700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question639Test {

    private Question639 question639 = new Question639();

    @Test
    void numDecodings() {
        Assertions.assertEquals(9, question639.numDecodings("*"));
    }

    @Test
    void numDecodings1() {
        Assertions.assertEquals(18, question639.numDecodings("1*"));
    }

    @Test
    void numDecodings2() {
        Assertions.assertEquals(15, question639.numDecodings("2*"));
    }

    @Test
    void numDecodings3() {
        Assertions.assertEquals(96, question639.numDecodings("**"));
    }

    @Test
    void numDecodings4() {
        Assertions.assertEquals(11, question639.numDecodings("*1"));
    }

    @Test
    void numDecodings5() {
        Assertions.assertEquals(18720, question639.numDecodings("**1**"));
    }
}