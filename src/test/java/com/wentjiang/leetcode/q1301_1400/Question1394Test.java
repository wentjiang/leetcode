package com.wentjiang.leetcode.q1301_1400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1394Test {

    private Question1394 question1394 = new Question1394();

    @Test
    void findLucky() {
        int result = question1394.findLucky(new int[]{2,2,3,4});
        Assertions.assertEquals(2,result);
    }

    @Test
    void findLucky1() {
        int result = question1394.findLucky(new int[]{1,2,2,3,3,3});
        Assertions.assertEquals(3,result);
    }

    @Test
    void findLucky2() {
        int result = question1394.findLucky(new int[]{2,2,2,3,3});
        Assertions.assertEquals(-1,result);
    }

    @Test
    void findLucky3() {
        int result = question1394.findLucky(new int[]{7,7,7,7,7,7,7});
        Assertions.assertEquals(7,result);
    }
}