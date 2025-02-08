package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question191_1Test {

    private Question191_1 question191 = new Question191_1();

    @Test
    void hammingWeight() {
        int result = question191.hammingWeight(11);
        Assertions.assertEquals(3,result);
    }
}