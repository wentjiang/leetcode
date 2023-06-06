package com.wentjiang.leetcode.practice.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day1Question3Test {

    private Day1Question3 day1Question3 = new Day1Question3();

    @Test
    public void case1() {
        int result = day1Question3.getShortestPath(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } });
        Assertions.assertEquals(7, result);
    }

    @Test
    public void case2() {
        int result = day1Question3.getShortestPath(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
        Assertions.assertEquals(12, result);
    }

    @Test
    public void case3() {
        int result = day1Question3.getShortestPath(new int[][] { { 1 } });
        Assertions.assertEquals(1, result);
    }

}