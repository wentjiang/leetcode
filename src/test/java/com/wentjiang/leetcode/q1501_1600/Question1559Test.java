package com.wentjiang.leetcode.q1501_1600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1559Test {

    private Question1559 question1559 = new Question1559();

    @Test
    void containsCycle() {
        Assertions.assertTrue(question1559.containsCycle(new char[][]{{'a', 'a', 'a', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'a', 'a', 'a'}}));
    }

    @Test
    void containsCycle1() {
        Assertions.assertFalse(question1559.containsCycle(new char[][]{{'a', 'b', 'b'}, {'b', 'z', 'b'}, {'b', 'b', 'a'}}));
    }
}