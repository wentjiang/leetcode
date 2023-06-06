package com.wentjiang.leetcode.q1601_1700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1614Test {

    private Question1614 question1614 = new Question1614();

    @Test
    void maxDepth() {
        Assertions.assertEquals(3, question1614.maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    void maxDepth1() {
        Assertions.assertEquals(3, question1614.maxDepth("(1)+((2))+(((3)))"));
    }

    @Test
    void maxDepth2() {
        Assertions.assertEquals(1, question1614.maxDepth("1+(2*3)/(2-1)"));
    }

    @Test
    void maxDepth3() {
        Assertions.assertEquals(0, question1614.maxDepth("1"));
    }
}