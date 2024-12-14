package com.wentjiang.leetcode.q2301_2400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2311Test {

    @Test
    void longestSubsequence1() {
        Assertions.assertEquals(5, Question2311.longestSubsequence("1001010", 5));
    }

    @Test
    void longestSubsequence2() {
        Assertions.assertEquals(6, Question2311.longestSubsequence("00101001", 1));
    }

    @Test
    void longestSubsequence3() {
        Assertions.assertEquals(6, Question2311.longestSubsequence("00101001", 1));
    }

    @Test
    void longestSubsequence4() {
        Assertions.assertEquals(96, Question2311.longestSubsequence(
                "111100010000011101001110001111000000001011101111111110111000011111011000010101110100110110001111001001011001010011010000011111101001101000000101101001110110000111101011000101",
                11713332));
    }

    @Test
    void longestSubsequence5() {
        Assertions.assertEquals(108, Question2311.longestSubsequence(
                "000101010011011001011101111000111111100001011000000100010000111100000011111001000111100111101001111001011101001011011101001011011001111111010011100011110111010000010000010111001001111101100001111",
                300429827));
    }
}