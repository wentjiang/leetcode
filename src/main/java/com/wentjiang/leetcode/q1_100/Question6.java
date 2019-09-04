package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author wentaojiang
 * @date 2019/9/1 9:23 PM
 * @description
 */
public class Question6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<List<Character>> result = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>());
        }
        boolean down = true;
        int currentLine = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (currentLine == 0) {
                down = true;
            }
            if (currentLine == numRows - 1) {
                down = false;
            }
            result.get(currentLine).add(aChar);
            if (down) {
                currentLine++;
            } else {
                currentLine--;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        result.stream().flatMap((Function<List<Character>, Stream<?>>) characters -> characters.stream())
            .forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
