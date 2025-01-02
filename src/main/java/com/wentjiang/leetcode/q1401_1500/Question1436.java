package com.wentjiang.leetcode.q1401_1500;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1436 {
    public String destCity(List<List<String>> paths) {
        Set<String> start = new HashSet<>();
        for (List<String> path : paths) {
            start.add(path.getFirst());
        }
        for (List<String> path : paths) {
            if (!start.contains(path.getLast())) {
                return path.getLast();
            }
        }
        return "";
    }
}