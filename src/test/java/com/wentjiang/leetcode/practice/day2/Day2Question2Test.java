package com.wentjiang.leetcode.practice.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day2Question2Test {

    private Day2Question2 day2Question2 = new Day2Question2();

    @Test
    public void case1() {
        int[] forbidden = new int[] { 14, 4, 18, 1, 15 };
        int result = day2Question2.minJumpCount(forbidden, 3, 15, 9);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void case2() {
        int[] forbidden = new int[] { 8, 3, 16, 6, 12, 20 };
        int result = day2Question2.minJumpCount(forbidden, 15, 13, 11);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void case3() {
        int[] forbidden = new int[] { 1, 6, 2, 14, 5, 17, 4 };
        int result = day2Question2.minJumpCount(forbidden, 16, 9, 7);
        Assertions.assertEquals(2, result);
    }

}