package com.wentjiang.leetcode.q2801_2900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2875Test {

    private Question2875 question2875 = new Question2875();

    @Test
    void minSizeSubarray() {
        int result = question2875.minSizeSubarray(new int[]{1,2,3}, 5);
        Assertions.assertEquals(2,result);
    }

    @Test
    void minSizeSubarray1() {
        int result = question2875.minSizeSubarray(new int[]{1,1,1,2,3}, 4);
        Assertions.assertEquals(2,result);
    }

    @Test
    void minSizeSubarray2() {
        int result = question2875.minSizeSubarray(new int[]{2,4,6,8}, 3);
        Assertions.assertEquals(-1,result);
    }

    @Test
    void minSizeSubarray3() {
        int result = question2875.minSizeSubarray(new int[]{2,1,5,7,7,1,6,3}, 39);
        Assertions.assertEquals(9,result);
    }

    @Test
    void minSizeSubarray4() {
        int result = question2875.minSizeSubarray(new int[]{1,2}, 3);
        Assertions.assertEquals(2,result);
    }
}