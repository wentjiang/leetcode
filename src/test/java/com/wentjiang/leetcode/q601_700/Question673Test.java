package com.wentjiang.leetcode.q601_700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question673Test {

    private Question673 question673 = new Question673();
    @Test
    void findNumberOfLIS() {
        int result = question673.findNumberOfLIS(new int[]{1,3,5,4,7});
        Assertions.assertEquals(2,result);
    }

    @Test
    void findNumberOfLIS1() {
        int result = question673.findNumberOfLIS(new int[]{2,2,2,2,2});
        Assertions.assertEquals(5,result);
    }
}