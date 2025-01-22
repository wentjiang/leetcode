package com.wentjiang.leetcode.q901_1000;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question990_1Test {

    private Question990_1 question9901 = new Question990_1();

    @Test
    void equationsPossible() {
        Assertions.assertTrue(question9901.equationsPossible(new String[]{"b==a","a==b"}));
    }
}