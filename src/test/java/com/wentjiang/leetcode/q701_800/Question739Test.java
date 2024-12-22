package com.wentjiang.leetcode.q701_800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question739Test {

    Question739 question739 = new Question739();

    @Test
    void dailyTemperatures() {
        int[] result = question739.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        Assertions.assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, result);
    }
}