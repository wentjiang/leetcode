package com.wentjiang.leetcode.q801_900;

import java.sql.ClientInfoStatus;
import java.util.*;

public class Question820 {
    public int minimumLengthEncoding(String[] words) {
        Set<String> good = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            for (int k = 1; k < word.length(); k++) {
                good.remove(word.substring(k));
            }
        }
        int result = 0;
        for (String word : good) {
            result += word.length() + 1;
        }
        return result;
    }
}
