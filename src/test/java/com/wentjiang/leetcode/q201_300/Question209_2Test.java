package com.wentjiang.leetcode.q201_300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question209_2Test {
    private Question209_2 question209 = new Question209_2();

    @Test
    void minSubArrayLen() {
        int result = question209.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        Assertions.assertEquals(2, result);
    }

    @Test
    void minSubArrayLen1() {
        int result = question209.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(3, result);
    }

    @Test
    void minSubArrayLen2() {
        int result = question209.minSubArrayLen(15, new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(5, result);
    }

    @Test
    void minSubArrayLen3() {
        int result = question209.minSubArrayLen(15, new int[]{5,1,3,5,10,7,4,9,2,8});
        Assertions.assertEquals(2, result);
    }
}