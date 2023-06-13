package com.wentjiang.leetcode.practice.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Day2Question1Test {

    @Test
    public void case1() {

        List<Integer> result = new ArrayList<>();
        Day2Question1.LRUCache cache = new Day2Question1.LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        result.add(cache.get(1));
        cache.put(2, 102);
        cache.put(3, 3);
        result.add(cache.get(1));
        result.add(cache.get(2));
        result.add(cache.get(3));
        Integer[] array = result.toArray(new Integer[] { result.size() });

        Assertions.assertArrayEquals(new Integer[] { 1, 1, -1, 3 }, array);
    }

}