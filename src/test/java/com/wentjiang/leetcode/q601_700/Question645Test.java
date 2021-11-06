package com.wentjiang.leetcode.q601_700;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question645Test {

    private Question645 question645 = new Question645();

    @Test
    public void findErrorNums() {
        Assertions.assertArrayEquals(new int[] { 2, 3 }, question645.findErrorNums(new int[] { 1, 2, 2, 4 }));
    }

    @Test
    public void findErrorNums1() {
        Assertions.assertArrayEquals(new int[] { 1, 2 }, question645.findErrorNums(new int[] { 1, 1 }));
    }

    @Test
    public void findErrorNums2() {
        Assertions.assertArrayEquals(new int[] { 2, 1 }, question645.findErrorNums(new int[] { 3, 2, 2 }));
    }

    @Test
    public void findErrorNums3() {
        Assertions.assertArrayEquals(new int[] { 2, 1 }, question645.findErrorNums(new int[] { 2, 3, 2 }));
    }

    @Test
    public void findErrorNums4() {
        Assertions.assertArrayEquals(new int[] { 3, 1 }, question645.findErrorNums(new int[] { 3, 2, 3, 4, 6, 5 }));
    }

    @Test
    public void findErrorNums5() {
        Assertions.assertArrayEquals(new int[] { 2, 10 },
                question645.findErrorNums(new int[] { 1, 5, 3, 2, 2, 7, 6, 4, 8, 9 }));
    }

}