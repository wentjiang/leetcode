package com.wentjiang.leetcode.q101_200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/13 6:54 PM
 * 
 * @description
 */
public class Question118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        if (numRows >= 1) {
            result.add(Collections.singletonList(1));
        }
        if (numRows >= 2) {
            result.add(Arrays.asList(1, 1));
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> preList = result.get(i - 1);
            List<Integer> temp = new ArrayList<>(preList.size() + 1);
            temp.add(1);
            for (int j = 0; j < preList.size() - 1; j++) {
                temp.add(preList.get(j) + preList.get(j + 1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
