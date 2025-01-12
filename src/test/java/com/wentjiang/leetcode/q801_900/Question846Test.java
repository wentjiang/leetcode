package com.wentjiang.leetcode.q801_900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question846Test {

    private Question846 question846 = new Question846();

    @Test
    void isNStraightHand() {
        Assertions.assertTrue(question846.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }
}