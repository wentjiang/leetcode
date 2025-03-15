package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question12_1Test {

    private Question12_1 question12 = new Question12_1();

    @Test
    void intToRoman() {

        String result = question12.intToRoman(3749);
        Assertions.assertEquals("MMMDCCXLIX",result);
    }
}