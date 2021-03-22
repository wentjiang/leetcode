package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question191Test {

    private Question191 question191 = new Question191();

    @Test
    void hammingWeight() {
        Assertions.assertEquals(3, question191.hammingWeight(19));
    }
}