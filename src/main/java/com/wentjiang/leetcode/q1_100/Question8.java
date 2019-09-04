package com.wentjiang.leetcode.q1_100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wentaojiang
 * @date 2019/9/4 7:24 PM
 * @description
 */
public class Question8 {
    public int myAtoi(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.addAll(Arrays.asList('-', '+', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
        boolean hasSign = false;
        boolean isFirst = true;
        boolean isSignFirst = true;
        char[] chars = str.trim().toCharArray();
        for (char ch : chars) {
            //判断字符是否在集合中
            if (!set.contains(ch)) {
                break;
            }
            //添加符号
            if (('-' == ch || '+' == ch)) {
                if (!isSignFirst) {
                    break;
                }
                if (hasSign) {
                    break;
                } else if (isFirst) {
                    hasSign = true;
                    isSignFirst = false;
                    stringBuilder.append(ch);
                }
                continue;
            }
            //如果是数字开头,且为0,跳过
            if (isFirst && '0' == ch) {
                isSignFirst = false;
                continue;
            } else {
                if (isFirst && !('0' == ch) || !isFirst) {
                    isSignFirst = false;
                    stringBuilder.append(ch);
                    isFirst = false;
                }
            }
        }

        String numStr = stringBuilder.toString();
        if (numStr.length() == 0 || (numStr.length() == 1 && hasSign)) {
            return 0;
        }

        if (numStr.length() > String.valueOf(Integer.MIN_VALUE).length()) {
            if (numStr.startsWith("-")) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        long num = Long.parseLong(numStr);
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) num;
    }
}
