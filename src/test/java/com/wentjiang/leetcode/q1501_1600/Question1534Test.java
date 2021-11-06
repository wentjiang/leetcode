package com.wentjiang.leetcode.q1501_1600;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question1534Test {

    private Question1534 question = new Question1534();

    @Test
    public void countGoodTriplets1() {
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        Assertions.assertEquals(4, question.countGoodTriplets(arr, 7, 2, 3));
        Assertions.assertEquals(4, question.countGoodTriplets_1(arr, 7, 2, 3));
    }

    @Test
    public void countGoodTriplets2() {
        int[] arr = { 1, 1, 2, 2, 3 };
        Assertions.assertEquals(0, question.countGoodTriplets(arr, 0, 0, 1));
        Assertions.assertEquals(0, question.countGoodTriplets_1(arr, 0, 0, 1));
    }
}