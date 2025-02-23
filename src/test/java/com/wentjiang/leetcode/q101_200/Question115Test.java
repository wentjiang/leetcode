package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question115Test {

    private Question115 question115 = new Question115();

    @Test
    void numDistinct() {
        int result = question115.numDistinct("rabbbit", "rabbit");
        Assertions.assertEquals(3, result);
    }

    @Test
    void numDistinct1() {
        int result = question115.numDistinct("babgbag", "bag");
        Assertions.assertEquals(5, result);
    }
}