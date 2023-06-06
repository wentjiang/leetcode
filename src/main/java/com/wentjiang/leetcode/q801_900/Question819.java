package com.wentjiang.leetcode.q801_900;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Long> collect = Arrays.stream(paragraph.toLowerCase().split("[ !?',;.]"))
                .filter(word -> word.length() != 0 && !bannedSet.contains(word))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect.entrySet().stream().max((o1, o2) -> (int) (o1.getValue() - o2.getValue())).get().getKey();
    }
}
