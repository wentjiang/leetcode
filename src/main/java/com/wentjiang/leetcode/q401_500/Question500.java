package com.wentjiang.leetcode.q401_500;

import java.util.*;

public class Question500 {
    public String[] findWords(String[] words) {
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";

        List<Set<Character>> lines = Arrays.asList(getSet(line1), getSet(line2), getSet(line3));
        List<String> result = new ArrayList<>();
        for (String word : words) {
            boolean[] inLines = new boolean[3];
            int index = 0;
            String lowCaseWord = word.toLowerCase();
            for (Set<Character> set : lines) {
                boolean containsAll = true;
                for (char chInWord : lowCaseWord.toCharArray()) {
                    if (set.contains(chInWord)) {
                        inLines[index] = true;
                    } else {
                        containsAll = false;
                        break;
                    }
                    if (inLines[0] && inLines[1] || inLines[2] && inLines[1] || inLines[0] && inLines[2]) {
                        break;
                    }
                }
                if (containsAll) {
                    result.add(word);
                }
                index++;
            }
        }
        return result.toArray(new String[] {});
    }

    public Set<Character> getSet(String line) {
        Set<Character> set = new HashSet<>();
        for (char ch : line.toCharArray()) {
            set.add(ch);
        }
        return set;
    }
}
