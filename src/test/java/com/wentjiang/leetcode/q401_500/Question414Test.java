package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question414Test {

    Question414 question414 = new Question414();

    @Test
    void thirdMax() {
        int result = question414.thirdMax(new int[] { -2147483648, 1, 1 });
        Assertions.assertEquals(1, result);
    }

    @Test
    void thirdMax1() {
        int result = question414.thirdMax(new int[] { 2, 2, 3, 1 });
        Assertions.assertEquals(1, result);
    }
}