package com.wentjiang.leetcode.q1_100;

import org.javatuples.Triplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Question4_1Test {

    private final Question4_1 question4_1 = new Question4_1();

    @ParameterizedTest
    @MethodSource("generator")
    public void testFindMedianSortedArrays(Triplet<int[], int[], Double> triplet) {
        Assertions.assertEquals(triplet.getValue2(),
                question4_1.findMedianSortedArrays(triplet.getValue0(), triplet.getValue1()));
    }

    public static Stream<Triplet<int[], int[], Double>> generator() {
        return Stream.of(
                new Triplet<>(new int[]{1, 3}, new int[]{2}, 2.0),
                new Triplet<>(new int[]{1, 2}, new int[]{3, 4}, 2.5),
                new Triplet<>(new int[]{0, 0}, new int[]{0, 0}, 0.0),
                new Triplet<>(new int[]{}, new int[]{1}, 1.0),
                new Triplet<>(new int[]{2}, new int[]{}, 2.0)
        );
    }
}
