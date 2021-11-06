package com.wentjiang.leetcode.q201_300;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question268Test {
    private Question268 question268 = new Question268();

    @Test
    public void testMissingNumber1() {
        Assertions.assertEquals(2, question268.missingNumber(new int[] { 3, 0, 1 }));
    }

    @Test
    public void testMissingNumber2() {
        Assertions.assertEquals(2, question268.missingNumber(new int[] { 0, 1 }));
    }

    @Test
    public void testMissingNumber3() {
        Assertions.assertEquals(8, question268.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }

    @Test
    public void testMissingNumber4() {
        Assertions.assertEquals(1, question268.missingNumber(new int[] { 0 }));
    }

    @Test
    public void testMissingNumber5() {
        Assertions.assertEquals(0, question268.missingNumber(new int[] { 1 }));
    }

}