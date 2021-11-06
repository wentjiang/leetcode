package com.wentjiang.leetcode.q101_200;

import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/12 9:24 PM
 * 
 * @description
 */
public class Question120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> last = triangle.get(i - 1);
            List<Integer> now = triangle.get(i);
            for (int j = 0; j < now.size(); j++) {
                if (j == 0) {
                    now.set(j, last.get(j) + now.get(j));
                } else if (j == now.size() - 1) {
                    now.set(j, last.get(j - 1) + now.get(j));
                } else {
                    now.set(j, Math.min(last.get(j), last.get(j - 1)) + now.get(j));
                }
                if (i == triangle.size() - 1 && result > now.get(j)) {
                    result = now.get(j);
                }
            }
        }
        return result;
    }
}
