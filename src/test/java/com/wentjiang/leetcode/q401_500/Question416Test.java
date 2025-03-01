package com.wentjiang.leetcode.q401_500;

import com.wentjiang.leetcode.q101_200.Question139;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question416Test {

    private Question416 question416 = new Question416();

    @Test
    void canPartition() {
        Assertions.assertTrue(question416.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    void canPartition1() {
        Assertions.assertFalse(question416.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    void canPartition2() {
        Assertions.assertFalse(question416.canPartition(new int[]{2, 2, 3, 5}));
    }

}