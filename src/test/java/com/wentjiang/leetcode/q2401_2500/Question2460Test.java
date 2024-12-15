package com.wentjiang.leetcode.q2401_2500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question2460Test {

    @Test
    public void applyOperations(){
        Assertions.assertArrayEquals(new int[]{1,4,2,0,0,0}, Question2460.applyOperations(new int[]{1,2,2,1,1,0}));
    }

    @Test
    public void applyOperations1(){
        Assertions.assertArrayEquals(new int[]{2,1}, Question2460.applyOperations(new int[]{2,1}));
    }


}