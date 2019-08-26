package com.wentjiang.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wentaojiang
 * @date 2019/8/26 8:07 PM
 * @description
 */
public class Question13 {

    public int romanToInt(String s) {
        int result = 0;

        Map<String, Integer> constants = new HashMap<>();
        constants.put("I", 1);
        constants.put("V", 5);
        constants.put("X", 10);
        constants.put("L", 50);
        constants.put("C", 100);
        constants.put("D", 500);
        constants.put("M", 1000);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int value = constants.get(String.valueOf(ch));
            boolean isEndChar = i == chars.length - 1;
            String nextCharStr = null;
            if (!isEndChar) {
                nextCharStr = String.valueOf(chars[i + 1]);
            }
            if (!isEndChar && "I".equals(String.valueOf(ch))) {
                if ("V".equals(nextCharStr)) {
                    result += constants.get("V") - constants.get("I");
                    i++;
                    continue;
                } else if ("X".equals(String.valueOf(chars[i + 1]))) {
                    result += constants.get("X") - constants.get("I");
                    i++;
                    continue;
                }
            }
            if (!isEndChar && "X".equals(String.valueOf(ch))) {
                if ("L".equals(String.valueOf(chars[i + 1]))) {
                    result += constants.get("L") - constants.get("X");
                    i++;
                    continue;
                } else if ("C".equals(String.valueOf(chars[i + 1]))) {
                    result += constants.get("C") - constants.get("X");
                    i++;
                    continue;
                }
            }
            if (!isEndChar && "C".equals(String.valueOf(ch))) {
                if ("D".equals(String.valueOf(chars[i + 1]))) {
                    result += constants.get("D") - constants.get("C");
                    i++;
                    continue;
                } else if ("M".equals(String.valueOf(chars[i + 1]))) {
                    result += constants.get("M") - constants.get("C");
                    i++;
                    continue;
                }
            }
            result += value;
        }
        return result;
    }

}
