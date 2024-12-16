package com.wentjiang.leetcode.q1401_1500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1470Test {

    Question1470 question1470 = new Question1470();

    @Test
    void shuffle() {
        Assertions.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, question1470.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
    }
}