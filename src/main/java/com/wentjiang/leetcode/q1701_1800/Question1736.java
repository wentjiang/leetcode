package com.wentjiang.leetcode.q1701_1800;

public class Question1736 {
    public String maximumTime(String time) {
        char replaceCh = '?';
        if (time.charAt(0) == replaceCh) {
            if (time.charAt(1) != replaceCh) {
                if (Integer.parseInt(String.valueOf(time.charAt(1))) >= 4) {
                    time = time.replaceFirst("\\?", "1");
                } else {
                    time = time.replaceFirst("\\?", "2");
                }
            } else {
                time = time.replaceFirst("\\?", "2");
                time = time.replaceFirst("\\?", "3");
            }
        }
        if (time.charAt(1) == replaceCh) {
            if (time.charAt(0) == '2') {
                time = time.replaceFirst("\\?", "3");
            } else {
                time = time.replaceFirst("\\?", "9");
            }
        }
        if (time.charAt(3) == replaceCh) {
            time = time.replaceFirst("\\?", "5");
        }
        if (time.charAt(4) == replaceCh) {
            time = time.replaceFirst("\\?", "9");
        }
        return time;
    }
}
