package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.q701_800.Question724;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question238Test {

    private Question238 question238 = new Question238();

    @Test
    void productExceptSelf() {

        int[] result = question238.productExceptSelf(new int[]{1, 2, 3, 4});
        int[] expect = new int[]{24, 12, 8, 6};
        Assertions.assertArrayEquals(expect, result);
    }
}