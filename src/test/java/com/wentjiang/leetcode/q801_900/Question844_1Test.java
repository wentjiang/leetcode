package com.wentjiang.leetcode.q801_900;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question844_1Test {
    private Question844_1 question844 = new Question844_1();

    @Test
    public void test_case1() {
        Assertions.assertTrue(question844.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test_case2() {
        Assertions.assertTrue(question844.backspaceCompare("a##c", "#a#c"));
    }
}