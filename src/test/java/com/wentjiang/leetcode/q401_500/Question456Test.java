package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question456Test {

    Question456 question456 = new Question456();

    @Test
    void find132pattern() {
        Assertions.assertFalse(question456.find132pattern(new int[]{1, 2, 3, 4}));
    }

    @Test
    void find132pattern1() {
        Assertions.assertTrue(question456.find132pattern(new int[]{3, 1, 4, 2}));
    }

    @Test
    void find132pattern2() {
        Assertions.assertFalse(question456.find132pattern(new int[]{-2, 1, -2}));
    }

    @Test
    void find132pattern3() {
        Assertions.assertTrue(question456.find132pattern(new int[]{3, 5, 0, 3, 4}));
    }

}