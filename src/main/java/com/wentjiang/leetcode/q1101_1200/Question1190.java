package com.wentjiang.leetcode.q1101_1200;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question1190 {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                char top = stack.pop();
                List<Character> tempList = new ArrayList<>();
                while (top != '(') {
                    tempList.add(top);
                    top = stack.pop();
                }
                stack.addAll(tempList);
            } else {
                stack.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
