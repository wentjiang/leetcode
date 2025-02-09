package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question169_1Test {

    private Question169_1 question169 = new Question169_1();

    @Test
    void majorityElement() {
        Assertions.assertEquals(2, question169.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    void majorityElement1() {
        Assertions.assertEquals(3, question169.majorityElement(new int[]{3, 2, 3}));
    }


    @Test
    void majorityElement2() {
        Assertions.assertEquals(5, question169.majorityElement(new int[]{6,5,5}));
    }
}