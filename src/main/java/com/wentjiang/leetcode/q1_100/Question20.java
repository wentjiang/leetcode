package com.wentjiang.leetcode.q1_100;

import java.util.Stack;

/**
 * @author wentaojiang
 * @date 2019/9/2 1:49 PM
 * @description
 */
public class Question20 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if ("(".equals(String.valueOf(ch))
                || "[".equals(String.valueOf(ch))
                || "{".equals(String.valueOf(ch))) {
                stack.push(ch);
            } else if (")".equals(String.valueOf(ch))
                || "]".equals(String.valueOf(ch))
                || "}".equals(String.valueOf(ch))) {
                if (stack.isEmpty()) {
                    return false;
                }
                char popChar = stack.pop();
                boolean match = ("(".equals(String.valueOf(popChar)) && ")".equals(String.valueOf(ch)))
                    || (("[".equals(String.valueOf(popChar)) && "]".equals(String.valueOf(ch))))
                    || (("{".equals(String.valueOf(popChar)) && "}".equals(String.valueOf(ch))));
                if (!match) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
