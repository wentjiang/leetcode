package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Question496Test {

    private Question496 question496 = new Question496();

    @Test
    void nextGreaterElement() {
        int[] result = question496.nextGreaterElement(new int[] { 4, 1, 2 }, new int[] { 1, 3, 4, 2 });
        int[] expect = new int[] { -1, 3, -1 };
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expect, result);
    }
}