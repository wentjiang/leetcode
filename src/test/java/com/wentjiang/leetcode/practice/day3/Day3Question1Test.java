package com.wentjiang.leetcode.practice.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day3Question1Test {

    private final Day3Question1 day3Question1 = new Day3Question1();

    @Test
    public void case1() {
        String[][] result = day3Question1.question(new String[][]{
                {"X", "X", "X", "X"}, {"X", "O", "O", "X"}, {"X", "X", "O", "X"}, {"X", "O", "X", "X"}
        });

        String[][] expected = new String[][]{
                {"X", "X", "X", "X"}, {"X", "X", "X", "X"}, {"X", "X", "X", "X"}, {"X", "O", "X", "X"}
        };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void case2() {
        String[][] result = day3Question1.question(new String[][]{
                {"X", "X", "X", "X"}, {"O", "O", "O", "X"}, {"X", "X", "O", "X"}, {"X", "O", "X", "X"}
        });

        String[][] expected = new String[][]{
                {"X", "X", "X", "X"}, {"O", "O", "O", "X"}, {"X", "X", "O", "X"}, {"X", "O", "X", "X"}
        };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void case3() {
        String[][] result = day3Question1.question(new String[][]{{"X"}});

        String[][] expected = new String[][]{{"X"}};
        Assertions.assertArrayEquals(expected, result);
    }


}