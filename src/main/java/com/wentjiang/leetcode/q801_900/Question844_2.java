package com.wentjiang.leetcode.q801_900;

import java.util.LinkedList;
import java.util.List;

public class Question844_2 {
    public boolean backspaceCompare(String S, String T) {
        return getResult(S).equals(getResult(T));
    }

    public String getResult(String str) {
        char[] chars = str.toCharArray();
        List<Integer> indexList = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == '#') {
                if (indexList.size() > 0) {
                    indexList.remove(indexList.size() - 1);
                }
            } else {
                indexList.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        indexList.stream().map(num -> chars[num]).forEach(sb::append);
        return sb.toString();
    }
}
