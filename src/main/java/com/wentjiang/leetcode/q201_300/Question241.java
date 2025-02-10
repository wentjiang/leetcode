package com.wentjiang.leetcode.q201_300;

import java.util.*;

public class Question241 {
    private Map<String, List<Integer>> cache = new HashMap<>();

    private final Set<Character> set = new HashSet<>();

    {
        set.add('-');
        set.add('+');
        set.add('*');
    }


    public List<Integer> diffWaysToCompute(String expression) {
        if (cache.containsKey(expression)) {
            return cache.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        //按位向后遍历
        for (int i = 0; i < expression.length(); i++) {
            //如果是运算符
            if (set.contains(expression.charAt(i))) {
                String firstExpression = expression.substring(0, i);
                String secondExpression = expression.substring(i + 1);
                diffWaysToCompute(firstExpression);
                diffWaysToCompute(secondExpression);
                List<Integer> r1 = cache.get(firstExpression);
                List<Integer> r2 = cache.get(secondExpression);
                for (Integer r1Value : r1) {
                    for (Integer r2Value : r2) {
                        if (expression.charAt(i) == '-') {
                            result.add(r1Value - r2Value);
                        }
                        if (expression.charAt(i) == '+') {
                            result.add(r1Value + r2Value);
                        }
                        if (expression.charAt(i) == '*') {
                            result.add(r1Value * r2Value);
                        }
                    }
                }
            }
            //如果是数字
            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--;
                String nString = sb.toString();
                //如果数字没在缓存中
                if (!cache.containsKey(nString)) {
                    Integer n = Integer.parseInt(nString);
                    List<Integer> list = new ArrayList<>();
                    list.add(n);
                    cache.put(expression, list);
                }
            }
        }
        if (!result.isEmpty()) {
            cache.put(expression, result);
        }
        return cache.get(expression);
    }
}
