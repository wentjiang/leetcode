package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2019/9/18 9:10 PM
 * @description
 */
public class Question58 {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        String[] strs = s.split(" ");
        return strs.length == 0 ? 0 : strs[strs.length - 1].length();
    }
}
