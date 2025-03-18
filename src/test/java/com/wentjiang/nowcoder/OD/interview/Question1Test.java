package com.wentjiang.nowcoder.OD.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {


    @Test
    void getResult() {
        int result = Question1.getResult(3,7);
        Assertions.assertEquals(28,result);
    }
}