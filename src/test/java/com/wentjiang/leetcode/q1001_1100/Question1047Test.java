package com.wentjiang.leetcode.q1001_1100;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question1047Test {

    private Question1047 question1047 = new Question1047();

    @Test
    public void removeDuplicates() {
        Assertions.assertEquals("ca", question1047.removeDuplicates("abbaca"));
    }
}