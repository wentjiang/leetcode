package com.wentjiang.leetcode.q201_300;

import java.util.HashSet;
import java.util.Set;

public class Question202 {

    /**
     * 如果重复出现过就不是快乐数
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        Set<Integer> passedNumber = new HashSet<>();
        passedNumber.add(n);
        String str = String.valueOf(n);
        boolean stop = false;
        while (!stop) {
            int total = 0;
            for (char ch : str.toCharArray()) {
                total += (int) Math.pow(Integer.parseInt(String.valueOf(ch)), 2);
            }
            if (total == 1) {
                return true;
            }
            if (passedNumber.contains(total)) {
                stop = true;
            } else {
                str = String.valueOf(total);
                passedNumber.add(total);
            }
        }
        return false;
    }
}
