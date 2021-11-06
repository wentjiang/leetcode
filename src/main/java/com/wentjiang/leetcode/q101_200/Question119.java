package com.wentjiang.leetcode.q101_200;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/13 7:31 PM
 * 
 * @description
 */
public class Question119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new LinkedList<>();
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }
        if (rowIndex == 1) {
            result.add(1);
            result.add(1);
            return result;
        }
        result.add(1);
        result.add(1);
        for (int i = 2; i <= rowIndex; i++) {
            result.add(1);
            for (int j = 0; j < i - 1; j++) {
                result.add(result.get(0) + result.get(1));
                result.remove(0);
            }
            result.remove(0);
            result.add(1);
        }
        return result;
    }
}
