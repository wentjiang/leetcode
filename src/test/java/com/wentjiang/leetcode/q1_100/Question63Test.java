package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question63Test {

    private Question63 question63 = new Question63();

    @Test
    void uniquePathsWithObstacles() {
        int result = question63.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}});
        Assertions.assertEquals(2,result);
    }

        @Test
    void uniquePathsWithObstacles1() {
        int result = question63.uniquePathsWithObstacles(new int[][]{{0}});
        Assertions.assertEquals(1,result);
    }
}