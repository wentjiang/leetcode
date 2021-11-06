package com.wentjiang.leetcode.q801_900;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question896Test {

    private Question896 question896 = new Question896();

    @Test
    public void isMonotonic() {
        Assertions.assertTrue(question896.isMonotonic(new int[] { 1, 2, 2, 3 }));
    }

    @Test
    public void isMonotonic1() {
        Assertions.assertTrue(question896.isMonotonic(new int[] { 6, 5, 4, 4 }));
    }

    @Test
    public void isMonotonic2() {
        Assertions.assertFalse(question896.isMonotonic(new int[] { 1, 3, 2 }));
    }

    @Test
    public void isMonotonic3() {
        Assertions.assertTrue(question896.isMonotonic(new int[] { 1, 2, 4, 5 }));
    }

    @Test
    public void isMonotonic4() {
        Assertions.assertTrue(question896.isMonotonic(new int[] { 1, 1, 1 }));
    }
}