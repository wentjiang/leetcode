package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question394Test {

    private Question394 question394 = new Question394();

    @Test
    void decodeString() {
        String result = question394.decodeString("3[a]2[bc]");
        String expect = "aaabcbc";
        Assertions.assertEquals(expect, result);
    }
}