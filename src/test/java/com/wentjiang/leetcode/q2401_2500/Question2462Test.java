package com.wentjiang.leetcode.q2401_2500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2462Test {

    private Question2462 question2462 = new Question2462();

    @Test
    void totalCost() {
        long sum = question2462.totalCost(new int[]{1,2,4,1},3,3);
        Assertions.assertEquals(4, sum);
    }

    @Test
    void totalCost2(){
        long sum = question2462.totalCost(new int[]{17,12,10,2,7,2,11,20,8},3,4);
        Assertions.assertEquals(11, sum);
    }

        @Test
    void totalCost3(){
        long sum = question2462.totalCost(new int[]{28,35,21,13,21,72,35,52,74,92,25,65,77,1,73,32,43,68,8,100,84,80,14,88,42,53,98,69,64,40,60,23,99,83,5,21,76,34},32,12);
        Assertions.assertEquals(1407, sum);
    }
}