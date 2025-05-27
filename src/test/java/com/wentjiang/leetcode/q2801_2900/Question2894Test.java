package com.wentjiang.leetcode.q2801_2900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2894Test {

    private Question2894 question2894 = new Question2894();

    @Test
    void differenceOfSums() {
        int result = question2894.differenceOfSums(10, 3);
        Assertions.assertEquals(19, result);
    }

    @Test
    void differenceOfSums1() {
        int result = question2894.differenceOfSums(5, 6);
        Assertions.assertEquals(15, result);
    }

    @Test
    void differenceOfSums2() {
        int result = question2894.differenceOfSums(5, 1);
        Assertions.assertEquals(-15, result);
    }
}