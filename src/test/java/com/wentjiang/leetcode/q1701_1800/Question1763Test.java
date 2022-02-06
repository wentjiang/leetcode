package com.wentjiang.leetcode.q1701_1800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1763Test {

    private Question1763 question1763 = new Question1763();

    @Test
    void longestNiceSubstring() {
        Assertions.assertEquals("aAa",question1763.longestNiceSubstring("YazaAay"));
    }

    @Test
    void longestNiceSubstring1() {
        Assertions.assertEquals("Bb",question1763.longestNiceSubstring("Bb"));
    }

    @Test
    void longestNiceSubstring2() {
        Assertions.assertEquals("",question1763.longestNiceSubstring("c"));
    }

    @Test
    void longestNiceSubstring3() {
        Assertions.assertEquals("dD",question1763.longestNiceSubstring("dDzeE"));
    }
}