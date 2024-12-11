package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question76Test {

    private Question76 question76 = new Question76();

    @Test
    public void minWindow() {
        Assertions.assertEquals("BANC", question76.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void minWindow1() {
        Assertions.assertEquals("a", question76.minWindow("a", "a"));
    }

    @Test
    public void minWindow2() {
        Assertions.assertEquals("", question76.minWindow("a", "aa"));
    }

    @Test
    public void minWindow3() {
        Assertions.assertEquals("aa", question76.minWindow("aa", "aa"));
    }
}