package com.wentjiang.leetcode.q701_800;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question740Test {
    private Question740 question740 = new Question740();

    @Test
    public void deleteAndEarn() {
        Assertions.assertEquals(6, question740.deleteAndEarn(new int[]{3, 4, 2}));
    }

    @Test
    public void deleteAndEarn1() {
        Assertions.assertEquals(9, question740.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    @Test
    public void deleteAndEarn2() {
        Assertions.assertEquals(4, question740.deleteAndEarn(new int[]{3, 1}));
    }

    @Test
    public void deleteAndEarn3() {
        Assertions.assertEquals(37, question740.deleteAndEarn(new int[]{8, 10, 4, 9, 1, 3, 5, 9, 4, 10}));
    }

}