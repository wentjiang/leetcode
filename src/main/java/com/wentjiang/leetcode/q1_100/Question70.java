package com.wentjiang.leetcode.q1_100;

import java.util.HashMap;
import java.util.Map;

public class Question70 {

    Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (cache.get(n - 1) == null) {
            cache.put(n - 1, climbStairs(n - 1));
        }
        if (cache.get(n - 2) == null) {
            cache.put(n - 2, climbStairs(n - 2));
        }

        int nMinus1 = cache.get(n - 1);
        int nMinus2 = cache.get(n - 2);
        return nMinus1 + nMinus2;
    }

}
