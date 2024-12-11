package com.wentjiang.leetcode.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PDDInterviewTest {
    @Test
    void process1() {
        int result = PDDInterview.process(new int[] { 1, 1, 1 }, 3);
        Assertions.assertEquals(0, result);
    }

    @Test
    void process2() {
        int result = PDDInterview.process(new int[] { 1, 2, 3 }, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    void process3() {
        int result = PDDInterview.process(new int[] { 1, 2, 3, 4 }, 3);
        Assertions.assertEquals(9, result);
    }

    @Test
    void process4() {
        int result = PDDInterview.process(new int[] { 1, 2, 3, 4 }, 2);
        Assertions.assertEquals(7, result);
    }

    @Test
    void process5() {
        int result = PDDInterview.process(new int[] { 4, 3, 2, 1 }, 2);
        Assertions.assertEquals(7, result);
    }

    @Test
    void process6() {
        int result = PDDInterview.process(new int[] { 4, 3, 2, 1 }, 1);
        Assertions.assertEquals(4, result);
    }

    @Test
    void process7() {
        int result = PDDInterview.process(new int[] { 4, 3, 2, 1 }, 5);
        Assertions.assertEquals(0, result);
    }
}
