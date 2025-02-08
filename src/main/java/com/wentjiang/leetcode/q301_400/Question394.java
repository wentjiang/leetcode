package com.wentjiang.leetcode.q301_400;

/**
 * 递归,逐个解析的方法
 */
public class Question394 {
    int i = 0;

    public String decodeString(String s) {
        return unfold(s.toCharArray());
    }

    public String unfold(char[] chars) {
        //终止条件
        if (i == chars.length || chars[i] == ']') {
            return "";
        }

        //默认系数为1, 如果有数组的话,系数为解析的数字
        int repeatNum = 1;
        StringBuilder sb = new StringBuilder();

        //如果是数字计算系数
        if (chars[i] >= '0' && chars[i] <= '9') {
            StringBuilder t = new StringBuilder();
            while (chars[i] >= '0' && chars[i] <= '9') {
                t.append(chars[i]);
                i++;
            }
            if (!t.isEmpty()) {
                repeatNum = Integer.parseInt(t.toString());
            }
            //过滤左括号
            i++;
            //获取系数中间的字符串
            String repeatString = unfold(chars);
            //过滤右括号
            i++;
            for (int j = 0; j < repeatNum; j++) {
                sb.append(repeatString);
            }
        } else if (chars[i] >= 'a' && chars[i] <= 'z') {
            //如果是字符,获取字符串的值
            while (i < chars.length && chars[i] >= 'a' && chars[i] <= 'z') {
                sb.append(chars[i]);
                i++;
            }
        }
        //需要考虑末尾为字符串的情况
        return sb.append(unfold(chars)).toString();
    }
}
