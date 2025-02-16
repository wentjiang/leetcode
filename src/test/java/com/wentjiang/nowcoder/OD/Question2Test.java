package com.wentjiang.nowcoder.OD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    private Question2 question2 = new Question2();

    @Test
    void getResult() {
        List<String> result = Question2.getResult("The furthest distance in the world, Is not between life and death, But when I stand in front of you, Yet you don't know that I love you.", "f");
        Assertions.assertArrayEquals(new String[]{"front", "furthest"}, result.toArray());
    }

    @Test
    void getResult1() {
        List<String> result = Question2.getResult("I love you", "He");
        Assertions.assertArrayEquals(new String[]{"He"}, result.toArray());
    }
}