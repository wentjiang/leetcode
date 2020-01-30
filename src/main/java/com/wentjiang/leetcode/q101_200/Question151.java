package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2020/1/30 10:00 AM
 * @description
 */
public class Question151 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] strs = s.trim().split(" ");
        for (int i = strs.length - 1; i > 0; i--) {
            if (strs[i].trim().length()>0){
                result.append(strs[i].trim()).append(" ");
            }
        }
        result.append(strs[0]);
        return result.toString();
    }
}
