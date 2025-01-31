package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.q501_600.Question560;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question53Test {

    Question53_1 question53 = new Question53_1();

    @Test
    void maxSubArray() {
        int result = question53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assertions.assertEquals(6, result);
    }

    @Test
    void maxSubArray1() {
        int result = question53.maxSubArray(new int[]{-2,-1});
        Assertions.assertEquals(-1, result);
    }
}