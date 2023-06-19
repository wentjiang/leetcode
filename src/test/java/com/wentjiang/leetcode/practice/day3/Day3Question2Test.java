package com.wentjiang.leetcode.practice.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day3Question2Test {
    private final Day3Question2 day3Question2 = new Day3Question2();

    @Test
    public void case1() {
        int result = day3Question2.question(new int[]{2,1,5,6,2,3});
        Assertions.assertEquals(10,result);
    }

    @Test
    public void case2() {
        int result = day3Question2.question(new int[]{2,4});
        Assertions.assertEquals(4,result);
    }

}