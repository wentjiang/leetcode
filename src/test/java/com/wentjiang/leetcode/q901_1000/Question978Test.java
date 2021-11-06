package com.wentjiang.leetcode.q901_1000;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question978Test {

    private Question978 question978 = new Question978();

    @Test
    public void maxTurbulenceSize() {
        int[] arr = new int[] { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
        Assertions.assertEquals(5, question978.maxTurbulenceSize(arr));
        Assertions.assertEquals(5, question978.maxTurbulenceSize1(arr));
        Assertions.assertEquals(5, question978.maxTurbulenceSize2(arr));
        Assertions.assertEquals(5, question978.maxTurbulenceSize3(arr));
    }

    @Test
    public void maxTurbulenceSize1() {
        int[] arr = new int[] { 4, 8, 12, 16 };
        Assertions.assertEquals(2, question978.maxTurbulenceSize(arr));
        Assertions.assertEquals(2, question978.maxTurbulenceSize1(arr));
        Assertions.assertEquals(2, question978.maxTurbulenceSize2(arr));
        Assertions.assertEquals(2, question978.maxTurbulenceSize3(arr));
    }
}