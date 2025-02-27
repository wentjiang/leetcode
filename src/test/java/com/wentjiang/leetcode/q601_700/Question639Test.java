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

    @Test
    void numDecodings6() {
        Assertions.assertEquals(196465252, question639.numDecodings("7*9*3*6*3*0*5*4*9*7*3*7*1*8*3*2*0*0*6*"));
    }


    @Test
    void numDecodings7() {
        Assertions.assertEquals(882201566, question639.numDecodings("1*6*7*1*9*6*2*9*2*3*3*6*3*2*2*4*7*2*9*6*0*6*4*4*1*6*9*0*5*9*2*5*7*7*0*6*9*7*1*5*5*9*3*0*4*9*2*6*2*5*7*6*1*9*4*5*8*4*7*4*2*7*1*2*1*9*1*3*0*6*"));
    }
}