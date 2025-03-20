package com.wentjiang.leetcode.lcr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCR189Test {

    private LCR189 lcr189 = new LCR189();

    @Test
    void mechanicalAccumulator() {
        int result = lcr189.mechanicalAccumulator(5);
        Assertions.assertEquals(15,result);
    }


    @Test
    void mechanicalAccumulator1() {
        int result = lcr189.mechanicalAccumulator(7);
        Assertions.assertEquals(28,result);
    }
}