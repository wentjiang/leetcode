package com.wentjiang.leetcode.q801_900;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question844_3Test {
    private Question844_3 question844 = new Question844_3();

    @Test
    public void test_case1() {
        Assertions.assertTrue(question844.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test_case2() {
        Assertions.assertTrue(question844.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void test_case3() {
        Assertions.assertFalse(question844.backspaceCompare("a#c", "b"));
    }

    @Test
    public void test_case4() {
        Assertions.assertTrue(question844.backspaceCompare("xywrrmp", "xywrrmu#p"));
    }

    @Test
    public void test_case5() {
        Assertions.assertTrue(question844.backspaceCompare("bxj##tw", "bxo#j##tw"));
    }

    @Test
    public void test_case6() {
        Assertions.assertFalse(question844.backspaceCompare("bxj##tw", "bxj###tw"));
    }

}
