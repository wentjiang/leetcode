package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/7 8:52 AM
 * 
 * @description
 */
public class Question17 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j", "k", "l"));
        map.put("6", Arrays.asList("m", "n", "o"));
        map.put("7", Arrays.asList("p", "q", "r", "s"));
        map.put("8", Arrays.asList("t", "u", "v"));
        map.put("9", Arrays.asList("w", "x", "y", "z"));
        for (char ch : digits.toCharArray()) {
            result = getResult(result, map.get(String.valueOf(ch)));
        }
        return result;
    }

    public List<String> getResult(List<String> current, List<String> strs) {
        if (current.size() == 0) {
            return strs;
        }
        List<String> result = new ArrayList<>();
        for (String str : current) {
            for (String ch : strs) {
                result.add(str + ch);
            }
        }
        return result;
    }
}
