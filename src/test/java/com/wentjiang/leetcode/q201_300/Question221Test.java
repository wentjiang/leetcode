package com.wentjiang.leetcode.q201_300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question221Test {

    private Question221 question221 = new Question221();

    @Test
    void maximalSquare() {
        int result = question221.maximalSquare(new char[][]{{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}});
        Assertions.assertEquals(4, result);
    }
}