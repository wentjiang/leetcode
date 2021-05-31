package com.wentjiang.leetcode.q1101_1200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Question1190Test {

    private Question1190 question1190 = new Question1190();

    @ParameterizedTest
    @MethodSource("resultAndParam")
    public void reverseParentheses(String result, String param) {
        Assertions.assertEquals(result, question1190.reverseParentheses(param));
    }

    static Stream<Arguments> resultAndParam() {
        return Stream.of(
                Arguments.arguments("dcba", "(abcd)"),
                Arguments.arguments("iloveu", "(u(love)i)"),
                Arguments.arguments("leetcode", "(ed(et(oc))el)"),
                Arguments.arguments("apmnolkjihgfedcbq", "a(bcdefghijkl(mno)p)q"));
    }
}