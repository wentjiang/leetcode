package com.wentjiang.leetcode.q1001_1100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1004Test {

    private Question1004 question1004 = new Question1004();

    @Test
    void longestOnes() {
        int result = question1004.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
        Assertions.assertEquals(6,result);
    }

    @Test
    void longestOnes1() {
        int result = question1004.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
        Assertions.assertEquals(10,result);
    }
}