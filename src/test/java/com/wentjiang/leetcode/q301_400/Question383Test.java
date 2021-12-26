package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question383Test {

    private Question383 question383 = new Question383();

    @Test
    void canConstruct1() {
        Assertions.assertFalse(question383.canConstruct("a", "b"));
    }

    @Test
    void canConstruct2() {
        Assertions.assertFalse(question383.canConstruct("aa", "ab"));
    }

    @Test
    void canConstruct3() {
        Assertions.assertTrue(question383.canConstruct("aa", "aab"));
    }

}