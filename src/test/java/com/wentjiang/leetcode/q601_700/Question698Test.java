package com.wentjiang.leetcode.q601_700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question698Test {

    private Question698 question698 = new Question698();

    @Test
    public void case1() {
        Assertions.assertTrue(question698.canPartitionKSubsets(new int[] { 4, 3, 2, 3, 5, 2, 1 }, 4));
    }

    @Test
    public void case2() {
        Assertions.assertFalse(question698.canPartitionKSubsets(new int[] { 1, 2, 3, 4 }, 3));
    }

    @Test
    public void case3() {
        Assertions.assertFalse(
                question698.canPartitionKSubsets(new int[] { 3, 3, 10, 2, 6, 5, 10, 6, 8, 3, 2, 1, 6, 10, 7, 2 }, 6));
    }

}