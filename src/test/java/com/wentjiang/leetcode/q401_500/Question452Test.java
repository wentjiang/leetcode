package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question452Test {
    private Question452 question452 = new Question452();

    @Test
    public void test1() {
        Assertions.assertEquals(2,
                question452.findMinArrowShots2(new int[][] { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } }));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, question452.findMinArrowShots2(new int[][] { { 1, 2147483647 } }));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(2, question452
                .findMinArrowShots2(new int[][] { { -2147483646, -2147483645 }, { 2147483646, 2147483647 } }));
    }
}