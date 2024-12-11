package com.wentjiang.leetcode.q501_600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question567Test {

    private Question567 question567 = new Question567();

    @Test
    public void checkInclusion() {
        Assertions.assertTrue(question567.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void checkInclusion1() {
        Assertions.assertFalse(question567.checkInclusion("ab", "eidboaoo"));
    }
}