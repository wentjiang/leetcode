package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question198_1Test {

    private Question198_1 question198 = new Question198_1();

    @Test
    void rob() {
        int result = question198.rob(new int[]{1,2,3,1});
        Assertions.assertEquals(4, result);
    }
}