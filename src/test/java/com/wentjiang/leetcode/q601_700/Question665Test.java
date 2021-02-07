package com.wentjiang.leetcode.q601_700;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question665Test {

    private Question665 question665 = new Question665();

    @Test
    public void checkPossibility1() {
        int[] nums = new int[]{4, 2, 3};
        Assertions.assertTrue(question665.checkPossibility(nums));
    }

    @Test
    public void checkPossibility2() {
        int[] nums = new int[]{4, 2, 1};
        Assertions.assertFalse(question665.checkPossibility(nums));
    }

    @Test
    public void checkPossibility3() {
        int[] nums = new int[]{3, 4, 2, 3};
        Assertions.assertFalse(question665.checkPossibility(nums));
    }

    @Test
    public void checkPossibility4() {
        int[] nums = new int[]{-1, 4, 2, 3};
        Assertions.assertTrue(question665.checkPossibility(nums));
    }
}