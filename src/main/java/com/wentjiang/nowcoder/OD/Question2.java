package com.wentjiang.nowcoder.OD;

import com.wentjiang.leetcode.utils.ArrayUtil;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String content = input.next();
        String pre = input.next();
        List<String> results = getResult(content, pre);
        StringBuilder sb = new StringBuilder();
        for (String result : results) {
            sb.append(result).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static List<String> getResult(String content, String pre) {
        List<String> allStrings = new ArrayList<>();
        Set<Character> splitChar = new HashSet<>();
        splitChar.add(' ');
        splitChar.add(',');
        splitChar.add('\'');
        for (int i = 0; i < content.length(); i++) {
            StringBuilder sb = new StringBuilder();
            while (i < content.length() && !splitChar.contains(content.charAt(i))) {
                sb.append(content.charAt(i));
                i++;
            }
            if (!sb.isEmpty()) {
                allStrings.add(sb.toString());
            }

        }
        List<String> result = new ArrayList<>();
        for (String string : allStrings) {
            if (string.startsWith(pre)) {
                result.add(string);
            }
        }
        result.sort(String::compareTo);
        if (result.isEmpty()) {
            result.add(pre);
        }
        return result;
    }
}
