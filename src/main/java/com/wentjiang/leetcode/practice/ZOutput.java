package com.wentjiang.leetcode.practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//Z字形输出字符串
public class ZOutput {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * https://www.nowcoder.com/practice/8d5f90b2433648aea7ecdaba02be0f5a?tpId=196&tqId=40410&ru=/exam/oj
     * 
     * @param str
     *            string字符串
     * @param k
     *            int整型
     * 
     * @return string字符串
     */
    public String zconvert(String str, int k) {
        if (str.length() <= 2) {
            return str;
        }
        boolean down = false;
        int currentRowNum = 0;
        char[] chars = str.toCharArray();
        List<StringBuilder> sbList = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            sbList.add(new StringBuilder());
        }
        for (int i = 0; i < chars.length; i++) {
            if (currentRowNum == 0 || currentRowNum == k - 1) {
                down = !down;
            }
            sbList.get(currentRowNum).append(chars[i]);
            if (down) {
                currentRowNum++;
            } else {
                currentRowNum--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result = result.append(sbList.get(i));
        }
        return result.toString();
    }

}
