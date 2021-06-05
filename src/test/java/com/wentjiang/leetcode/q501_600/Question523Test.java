package com.wentjiang.leetcode.q501_600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Question523Test {

    private Question523 question523 = new Question523();

    @ParameterizedTest
    @MethodSource("resultAndParams")
    public void checkSubarraySum1(boolean result, int[] nums, int k) {
        Assertions.assertEquals(result, question523.checkSubarraySum1(nums, k));
    }

    @ParameterizedTest
    @MethodSource("resultAndParams")
    public void checkSubarraySum(boolean result, int[] nums, int k) {
        Assertions.assertEquals(result, question523.checkSubarraySum(nums, k));
    }

    @ParameterizedTest
    @MethodSource("resultAndParams")
    public void checkSubarraySum2(boolean result, int[] nums, int k) {
        Assertions.assertEquals(result, question523.checkSubarraySum2(nums, k));
    }

    static Stream<Arguments> resultAndParams() {
        return Stream.of(
                Arguments.arguments(true, new int[]{23, 2, 4, 6, 7}, 6),
                Arguments.arguments(true, new int[]{23, 2, 6, 4, 7}, 6),
                Arguments.arguments(false, new int[]{23, 2, 6, 4, 7}, 13),
                Arguments.arguments(true, new int[]{23, 2, 4, 6, 6}, 7),
                Arguments.arguments(true, new int[]{2, 4, 3}, 6),
                Arguments.arguments(false, new int[]{0}, 1),
                Arguments.arguments(true, new int[]{0, 0}, 1)
        );
    }
}