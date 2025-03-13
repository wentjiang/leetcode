package com.wentjiang.leetcode.lcr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCR041Test {

    @Test
    public void test1(){
        LCR041.MovingAverage movingAverage = new LCR041.MovingAverage(3);
        Assertions.assertEquals(1,movingAverage.next(1),0.0001);
    }

}