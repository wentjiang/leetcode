package com.wentjiang.leetcode.q201_300;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question241Test {

    private Question241 question241 = new Question241();

    @Test
    void diffWaysToCompute() {
        List<Integer> result = question241.diffWaysToCompute("2-1-1");
        System.out.println(result);
    }


    @Test
    void diffWaysToCompute1() {
        List<Integer> result = question241.diffWaysToCompute("2*3-4*5");
        System.out.println(result);
    }

    @Test
    void diffWaysToCompute2() {
        List<Integer> result = question241.diffWaysToCompute("3-4*5");
        System.out.println(result);
    }
}