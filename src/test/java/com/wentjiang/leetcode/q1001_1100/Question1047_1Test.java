package com.wentjiang.leetcode.q1001_1100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1047_1Test {

    private Question1047_1 question1047 = new Question1047_1();

    @Test
    public void removeDuplicates() {
        Assertions.assertEquals("ca", question1047.removeDuplicates("abbaca"));
    }
}