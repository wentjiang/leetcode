package com.wentjiang.leetcode.q1501_1600;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question1518Test {
    private Question1518 question1518 = new Question1518();

    @Test
    public void test1() {
        Assertions.assertEquals(13, question1518.numWaterBottles(9, 3));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(19, question1518.numWaterBottles(15, 4));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(11, question1518.numWaterBottles(10, 6));
    }
}