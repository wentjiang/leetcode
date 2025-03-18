package com.wentjiang.leetcode.q701_800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question740_1Test {

    private Question740_1 question740 = new Question740_1();

    @Test
    void deleteAndEarn() {
        int result = question740.deleteAndEarn(new int[]{3,4,2});
        Assertions.assertEquals(6,result);
    }

    @Test
    void deleteAndEarn1() {
        int result = question740.deleteAndEarn(new int[]{2,2,3,3,3,4});
        Assertions.assertEquals(9,result);
    }
}