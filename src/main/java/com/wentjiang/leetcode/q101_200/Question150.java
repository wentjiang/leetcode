package com.wentjiang.leetcode.q101_200;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author wentao.jiang
 * @date 2020/1/29 8:39 PM
 * @description
 */
public class Question150 {

    public int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        int result = 0;
        LinkedList<Integer> numbers = new LinkedList<>();
        for (String token : tokens) {
            if (set.contains(token)) {
                Integer num1 = numbers.pollLast();
                Integer num2 = numbers.pollLast();
                switch (token) {
                    case "+":
                        result = num2 + num1;
                        numbers.add(result);
                        break;
                    case "-":
                        result = num2 - num1;
                        numbers.add(result);
                        break;
                    case "*":
                        result = num2 * num1;
                        numbers.add(result);
                        break;
                    case "/":
                        result = num2 / num1;
                        numbers.add(result);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } else {
                numbers.add(Integer.parseInt(token));
                result = Integer.parseInt(token);
            }
        }
        return result;

    }

}
