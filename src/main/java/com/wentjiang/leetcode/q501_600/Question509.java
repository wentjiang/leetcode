package com.wentjiang.leetcode.q501_600;

import java.util.HashMap;
import java.util.Map;

public class Question509 {

    private final Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            int num1;
            int num2;
            if (map.get(n - 1) != null) {
                num1 = map.get(n - 1);
            } else {
                num1 = fib(n - 1);
                map.put(n - 1, num1);
            }
            if (map.get(n - 2) != null) {
                num2 = map.get(n - 2);
            } else {
                num2 = fib(n - 2);
                map.put(n - 2, num2);
            }

            return num1 + num2;
        }
    }

}
