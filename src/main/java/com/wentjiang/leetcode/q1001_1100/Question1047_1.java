package com.wentjiang.leetcode.q1001_1100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question1047_1 {
    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (Character ch : s.toCharArray()) {
            if (!deque.isEmpty() && deque.peekLast() == ch) {
                while (!deque.isEmpty() && deque.peekLast() == ch) {
                    deque.pollLast();
                }
            } else {
                deque.offer(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()){
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
}
