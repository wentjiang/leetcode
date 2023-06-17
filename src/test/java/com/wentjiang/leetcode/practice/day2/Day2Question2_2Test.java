package com.wentjiang.leetcode.practice.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day2Question2_2Test {

    private final Day2Question2_2 day2Question2 = new Day2Question2_2();

    @Test
    public void case1() {
        int[] forbidden = new int[]{14, 4, 18, 1, 15};
        int result = day2Question2.minimumJumps(forbidden, 3, 15, 9);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void case2() {
        int[] forbidden = new int[]{8, 3, 16, 6, 12, 20};
        int result = day2Question2.minimumJumps(forbidden, 15, 13, 11);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void case3() {
        int[] forbidden = new int[]{1, 6, 2, 14, 5, 17, 4};
        int result = day2Question2.minimumJumps(forbidden, 16, 9, 7);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void case4() {
        int[] forbidden = new int[]{162,118,178,152,167,100,40,74,199,186,26,73,200,127,30,124,193,84,184,36,103,149,153,9,54,154,133,95,45,198,79,157,64,122,59,71,48,177,82,35,14,176,16,108,111,6,168,31,134,164,136,72,98};
        int result = day2Question2.minimumJumps(forbidden, 29, 98, 80);
        Assertions.assertEquals(121, result);
    }

}