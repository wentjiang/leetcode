package com.wentjiang.leetcode.q1_100;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wentaojiang
 * @date 2019/9/6 9:05 PM
 * @description
 */
public class Question12 {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            while (num >= key) {
                num -= key;
                stringBuilder.append(value);
            }
        }
        return stringBuilder.toString();
    }
}
