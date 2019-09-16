package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/16 9:37 AM
 * @description
 */
public class Question38 {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = doCountAndSay(result);
        }
        return result;
    }

    private String doCountAndSay(String result) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = result.toCharArray();
        for (int i = 0; i < chars.length;) {
            int num = 0;
            char ch = chars[i];
            for (int j = i; j < chars.length; j++) {
                if (chars[j] == ch) {
                    num++;
                }else{
                    break;
                }
            }
            i += num;
            stringBuilder.append(num);
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

}
