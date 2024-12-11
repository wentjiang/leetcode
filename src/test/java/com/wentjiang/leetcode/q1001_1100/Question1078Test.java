package com.wentjiang.leetcode.q1001_1100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1078Test {

    private Question1078 question1078 = new Question1078();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new String[] { "girl", "student" },
                question1078.findOcurrences("alice is a good girl she is a good student", "a", "good"));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new String[] { "we", "rock" },
                question1078.findOcurrences("we will we will rock you", "we", "will"));
    }
}