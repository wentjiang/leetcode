package com.wentjiang.nowcoder.OD.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void getResult() {
        int result = Question2.getResult(2, 8, new String[]{"hello", "world"});
        Assertions.assertEquals( 1,result);
    }

    @Test
    void getResult1() {
        int result = Question2.getResult(3, 6, new String[]{"a", "bcd", "e"});
        Assertions.assertEquals( 2,result);
    }

    @Test
    void getResult2() {
        int result = Question2.getResult(4, 5, new String[]{"I", "had", "apple", "pie"});
        Assertions.assertEquals( 1,result);
    }
}