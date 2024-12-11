package com.wentjiang.leetcode.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterView_17_10Test {

    private InterView_17_10 interView_17_10 = new InterView_17_10();

    @Test
    public void majorityElement() {
        Assertions.assertEquals(5, interView_17_10.majorityElement(new int[] { 1, 2, 5, 9, 5, 9, 5, 5, 5 }));
    }

    @Test
    public void majorityElement1() {
        Assertions.assertEquals(-1, interView_17_10.majorityElement(new int[] { 3, 2 }));
    }

    @Test
    public void majorityElement2() {
        Assertions.assertEquals(2, interView_17_10.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

}