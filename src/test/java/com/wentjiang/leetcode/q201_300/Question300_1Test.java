package com.wentjiang.leetcode.q201_300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question300_1Test {

    private Question300_1 question300 = new Question300_1();

    @Test
    void lengthOfLIS() {
        int result = question300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        Assertions.assertEquals(4, result);
    }

    @Test
    void lengthOfLIS1() {
        int result = question300.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6});
        Assertions.assertEquals(6, result);
    }
}