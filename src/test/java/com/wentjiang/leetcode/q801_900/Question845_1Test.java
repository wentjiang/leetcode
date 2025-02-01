package com.wentjiang.leetcode.q801_900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question845_1Test {

    private Question845_1 question8451 = new Question845_1();

    @Test
    void longestMountain() {
        int result = question8451.longestMountain(new int[]{2,1,4,7,3,2,5});
        Assertions.assertEquals(5,result);
    }
}