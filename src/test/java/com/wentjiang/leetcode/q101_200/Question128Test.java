package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question128Test {

    private Question128 question128 = new Question128();

    @Test
    void longestConsecutive() {
        Assertions.assertEquals(4, question128.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
    }
}