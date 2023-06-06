package com.wentjiang.leetcode.q501_600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question553Test {

    private Question553 question553 = new Question553();

    @Test
    void optimalDivision1() {
        Assertions.assertEquals("1", question553.optimalDivision(new int[] { 1 }));
    }

    @Test
    void optimalDivision2() {
        Assertions.assertEquals("10/2", question553.optimalDivision(new int[] { 10, 2 }));
    }

    @Test
    void optimalDivision3() {
        Assertions.assertEquals("100/(10/2)", question553.optimalDivision(new int[] { 100, 10, 2 }));
    }

    @Test
    void optimalDivision() {
        Assertions.assertEquals("1000/(100/10/2)", question553.optimalDivision(new int[] { 1000, 100, 10, 2 }));
    }
}