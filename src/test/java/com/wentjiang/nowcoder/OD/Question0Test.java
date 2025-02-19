package com.wentjiang.nowcoder.OD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0Test {

    private Question0 question0 = new Question0();

    @Test
    void getResult() {
        String result = question0.getResult("thisisanewday111forme", "good");
        Assertions.assertEquals("orm", result);
    }

    @Test
    void getResult1() {
        String result = question0.getResult("123admyffc79pt", "ssyy");
        Assertions.assertEquals("pt", result);
    }
}