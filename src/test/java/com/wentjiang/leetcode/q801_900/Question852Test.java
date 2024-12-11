package com.wentjiang.leetcode.q801_900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question852Test {

    private Question852 question852 = new Question852();

    @Test
    public void peakIndexInMountainArray() {
        Assertions.assertEquals(1, question852.peakIndexInMountainArray(new int[] { 0, 1, 0 }));
    }

    @Test
    public void peakIndexInMountainArray1() {
        Assertions.assertEquals(1, question852.peakIndexInMountainArray(new int[] { 0, 2, 1, 0 }));
    }

    @Test
    public void peakIndexInMountainArray2() {
        Assertions.assertEquals(2,
                question852.peakIndexInMountainArray(new int[] { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 }));
    }
}