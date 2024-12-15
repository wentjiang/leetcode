package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question75_1Test {

    @Test
    void sortColors() {
        int[] nums = new int[]{2,0,2,1,1,0};
        Question75_1.sortColors(nums);
        Assertions.assertArrayEquals(new int[]{0,0,1,1,2,2},nums);
    }

    @Test
    void sortColors1() {
        int[] nums = new int[]{2,0,1};
        Question75_1.sortColors(nums);
        Assertions.assertArrayEquals(new int[]{0,1,2},nums);
    }

    @Test
    void sortColors2() {
        int[] nums = new int[]{0};
        Question75_1.sortColors(nums);
        Assertions.assertArrayEquals(new int[]{0},nums);
    }

    @Test
    void sortColors3() {
        int[] nums = new int[]{0,0};
        Question75_1.sortColors(nums);
        Assertions.assertArrayEquals(new int[]{0,0},nums);
    }
}