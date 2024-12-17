package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question189_2Test {

    @Test
    void rotate() {
        int[] nums = new int[] { 3, 2, 2, 3 };
        Question189_2.rotate(nums, 3);
        Assertions.assertArrayEquals(new int[] { 2, 2, 3, 3 }, nums);
    }

    @Test
    void rotate1() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        Question189_2.rotate(nums, 3);
        Assertions.assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums);
    }
}