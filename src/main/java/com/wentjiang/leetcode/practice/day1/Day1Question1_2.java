package com.wentjiang.leetcode.practice.day1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Day1Question1_2 {

    public boolean bracketMatch(String input) {
        if (input == null || input.length() == 0) {
            return true;
        }
        if (input.length() % 2 != 0) {
            return false;
        }
        Set<Character> rightBrackets = new HashSet<>();
        rightBrackets.add(')');
        rightBrackets.add(']');
        rightBrackets.add('}');
        Set<Character> leftBrackets = new HashSet<>();
        leftBrackets.add('(');
        leftBrackets.add('[');
        leftBrackets.add('{');
        List<Character> stack = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            if (stack.size() == 0 && rightBrackets.contains(ch)) {
                return false;
            }
            if (leftBrackets.contains(ch)) {
                stack.add(ch);
            }
            if (rightBrackets.contains(ch)) {
                char last = stack.get(stack.size() - 1);
                if ((last == '(' && ch != ')') || last == '[' && ch != ']' || last == '{' && ch != '}') {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }
            }
        }
        return stack.size() == 0;
    }

}
