package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question393Test {

    private Question393 question393 = new Question393();

    @Test
    void validUtf8() {
        Assertions.assertTrue(question393.validUtf8(new int[] { 197, 130, 1 }));
    }

    @Test
    void validUtf8_1() {
        Assertions.assertFalse(question393.validUtf8(new int[] { 235, 140, 4 }));
    }

    @Test
    void validUtf8_2() {
        Assertions.assertFalse(question393.validUtf8(new int[] { 237 }));
    }

    @Test
    void validUtf8_3() {
        Assertions.assertFalse(question393.validUtf8(new int[] { 145 }));
    }
}