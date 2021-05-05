package com.wentjiang.leetcode.q101_200;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question198Test {

    private Question198 question198 = new Question198();

    @Test
    public void rob() {
        Assertions.assertEquals(4, question198.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void rob1() {
        Assertions.assertEquals(12, question198.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void rob2() {
        Assertions.assertEquals(4, question198.rob(new int[]{2, 1, 1, 2}));
    }
}