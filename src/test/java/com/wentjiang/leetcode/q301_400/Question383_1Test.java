package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question383_1Test {

    private Question383_1 question383_1 = new Question383_1();

    @Test
    void canConstruct() {
        Assertions.assertFalse(question383_1.canConstruct("aa", "ab"));
    }
}