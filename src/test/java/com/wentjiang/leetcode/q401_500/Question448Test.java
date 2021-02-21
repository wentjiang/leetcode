package com.wentjiang.leetcode.q401_500;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;

public class Question448Test {

    private Question448 question448 = new Question448();

    @Test
    public void findDisappearedNumbers() {
        Assertions.assertEquals(Arrays.asList(5, 6),
                question448.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        Assertions.assertEquals(Arrays.asList(5, 6),
                question448.findDisappearedNumbers_1(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        Assertions.assertEquals(Arrays.asList(5, 6),
                question448.findDisappearedNumbers_2(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void findDisappearedNumbers1() {
        Assertions.assertEquals(Collections.emptyList(), question448.findDisappearedNumbers(new int[]{}));
        Assertions.assertEquals(Collections.emptyList(), question448.findDisappearedNumbers_1(new int[]{}));
        Assertions.assertEquals(Collections.emptyList(), question448.findDisappearedNumbers_2(new int[]{}));
    }

    @Test
    public void findDisappearedNumbers2() {
        Assertions.assertEquals(Collections.singletonList(2), question448.findDisappearedNumbers(new int[]{1, 1}));
        Assertions.assertEquals(Collections.singletonList(2), question448.findDisappearedNumbers_1(new int[]{1, 1}));
        Assertions.assertEquals(Collections.singletonList(2), question448.findDisappearedNumbers_2(new int[]{1, 1}));
    }
}