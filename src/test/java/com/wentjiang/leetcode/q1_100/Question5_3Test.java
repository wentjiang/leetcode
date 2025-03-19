package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question5_3Test {

    private Question5_3 question5 = new Question5_3();

    @Test
    void longestPalindrome() {
        String result = question5.longestPalindrome("babad");
        Assertions.assertEquals("bab", result);
    }

    @Test
    void longestPalindrome1() {
        String result = question5.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", result);
    }
}