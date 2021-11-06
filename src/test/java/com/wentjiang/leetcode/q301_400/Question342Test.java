package com.wentjiang.leetcode.q301_400;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Question342Test {

    private Question342 question342 = new Question342();

    @ParameterizedTest
    @MethodSource("resultAndParam")
    public void isPowerOfFour(boolean result, int param) {
        Assertions.assertEquals(result, question342.isPowerOfFour(param));
    }

    static Stream<Arguments> resultAndParam() {
        return Stream.of(Arguments.arguments(true, 16), Arguments.arguments(false, 5), Arguments.arguments(true, 1));
    }
}