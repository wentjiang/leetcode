package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question392_1Test {

    private Question392_1 question392 = new Question392_1();

    @Test
    void isSubsequence() {
        boolean result = question392.isSubsequence("abc", "ahbgdc");
        Assertions.assertTrue(result);
    }

    @Test
    void isSubsequence1() {
        boolean result = question392.isSubsequence("axc", "ahbgdc");
        Assertions.assertFalse(result);
    }

    @Test
    void isSubsequence2() {
        boolean result = question392.isSubsequence("b", "c");
        Assertions.assertFalse(result);
    }

        @Test
    void isSubsequence3() {
        boolean result = question392.isSubsequence("aza", "abzba");
        Assertions.assertTrue(result);
    }
}