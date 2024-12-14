package com.wentjiang.leetcode.q501_600;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question542_2Test {

    @Test
    void updateMatrix() {
        int[][] result = Question542_2.updateMatrix(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } });
        Assertions.assertArrayEquals(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 2, 1 } }, result);
    }

    @Test
    void updateMatrix1() {
        int[][] result = Question542_2.updateMatrix(new int[][] { { 0, 1, 0, 1, 1 }, { 1, 1, 0, 0, 1 },
                { 0, 0, 0, 1, 0 }, { 1, 0, 1, 1, 1 }, { 1, 0, 0, 0, 1 } });
        Assertions.assertArrayEquals(new int[][] { { 0, 1, 0, 1, 2 }, { 1, 1, 0, 0, 1 }, { 0, 0, 0, 1, 0 },
                { 1, 0, 1, 1, 1 }, { 1, 0, 0, 0, 1 } }, result);
    }

}