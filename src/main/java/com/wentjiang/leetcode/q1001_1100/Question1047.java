package com.wentjiang.leetcode.q1001_1100;

import java.util.Stack;

public class Question1047 {
    public String removeDuplicates(String S) {
        int length = S.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char currentChar = S.charAt(i);
            if (stack.isEmpty()) {
                stack.add(currentChar);
            } else if (stack.peek().equals(currentChar)) {
                stack.pop();
            } else {
                stack.add(currentChar);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
