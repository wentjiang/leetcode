package com.wentjiang.leetcode.q1701_1800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1704Test {

    private Question1704 question1704 = new Question1704();

    @Test
    public void halvesAreAlike() {
        Assertions.assertTrue(question1704.halvesAreAlike("book"));
    }

    @Test
    public void halvesAreAlike_1() {
        Assertions.assertFalse(question1704.halvesAreAlike("textbook"));
    }

    @Test
    public void halvesAreAlike_2() {
        Assertions.assertFalse(question1704.halvesAreAlike("MerryChristmas"));
    }

    @Test
    public void halvesAreAlike_3() {
        Assertions.assertTrue(question1704.halvesAreAlike("AbCdEfGh"));
    }
}