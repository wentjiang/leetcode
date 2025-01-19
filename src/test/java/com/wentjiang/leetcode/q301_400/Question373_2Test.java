package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question373_2Test {


    private Question373_2 question3732 = new Question373_2();

    @Test
    void kSmallestPairs() {
        List<List<Integer>> list = question3732.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);
        System.out.println(list.toString());
    }


    @Test
    void kSmallestPairs1() {
        List<List<Integer>> list = question3732.kSmallestPairs(new int[]{1,2,4,5,6}, new int[]{3,5,7,9}, 3);
        System.out.println(list.toString());
    }
}