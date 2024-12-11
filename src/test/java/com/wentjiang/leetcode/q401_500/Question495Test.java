package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question495Test {

    private Question495 question495 = new Question495();

    @Test
    public void test1() {
        Assertions.assertEquals(4, question495.findPoisonedDuration(new int[] { 1, 4 }, 2));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(3, question495.findPoisonedDuration(new int[] { 1, 2 }, 2));
    }

}