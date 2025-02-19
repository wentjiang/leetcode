package com.wentjiang.nowcoder.OD;

import java.util.*;

public class Question0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String result = getResult(str1, str2);
        System.out.println(result);
    }

    public static String getResult(String str1, String str2) {

        Set<Character> str2Set = new HashSet<>();
        for (Character ch : str2.toCharArray()) {
            str2Set.add(ch);
        }

        int str2DiffCount = str2Set.size();
        List<String> candidatesString = new ArrayList<>();
        char[] str1Chars = str1.toCharArray();
        for (int i = 0; i < str1Chars.length; i++) {
            StringBuilder sb = new StringBuilder();
            //是扰乱字符串
            while (i < str1Chars.length && !isBadChar(str1Chars[i])) {
                sb.append(str1Chars[i]);
                i++;
            }
            if (!sb.isEmpty()) {
                candidatesString.add(sb.toString());
            }
        }

        List<String> candidatesString2 = new ArrayList<>();

        int maxLength = 0;

        for (String candidate : candidatesString) {
            char[] chs = candidate.toCharArray();
            Set<Character> set = new HashSet<>();
            for (char ch : chs) {
                set.add(ch);
            }
            if (set.size() <= str2DiffCount) {
                maxLength = Math.max(maxLength, candidate.length());
                if (maxLength == candidate.length()) {
                    candidatesString2.add(candidate);
                }
            }
        }

        if (!candidatesString2.isEmpty()) {
            candidatesString2.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.length() > o2.length()) {
                        return -1;
                    } else if (o1.length() == o2.length()) {
                        return o2.compareTo(o1);
                    } else {
                        return 1;
                    }
                }
            });
            return candidatesString2.get(0);
        }
        return "Not Found";
    }

    public static boolean isBadChar(char ch) {
        return (ch >= '0' && ch <= '9')
                || (ch >= 'a' && ch <= 'f');
    }
}
