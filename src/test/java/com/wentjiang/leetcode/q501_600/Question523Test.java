package com.wentjiang.leetcode.q501_600;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Question523Test {

    private Question523 question523 = new Question523();

    @ParameterizedTest
    @MethodSource("resultAndParams")
    public void checkSubarraySum(boolean result, int[] nums, int k) {
        Assertions.assertEquals(result, question523.checkSubarraySum(nums, k));
    }

    static Stream<Arguments> resultAndParams() {
        return Stream.of(
                Arguments.arguments(true, new int[]{23, 2, 4, 6, 7}, 6),
                Arguments.arguments(true, new int[]{23, 2, 6, 4, 7}, 6),
                Arguments.arguments(false, new int[]{23, 2, 6, 4, 7}, 13),
                Arguments.arguments(true, new int[]{23, 2, 4, 6, 6}, 7)
        );
    }

    @Test
    public void test1(){
        Assertions.assertTrue(question523.checkSubarraySum(new int[]{23, 2, 4, 6, 6}, 7));
    }
}