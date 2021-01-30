package com.wentjiang.leetcode.q701_800;

import java.util.ArrayList;
import java.util.List;

public class Question728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i < right + 1; i++) {
            if (isSelfDividingNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    boolean isSelfDividingNumber(int num) {
        String numString = String.valueOf(num);
        if (numString.contains("0")) {
            return false;
        }
        char[] chars = numString.toCharArray();
        for (char ch : chars) {
            if (num % Integer.parseInt(String.valueOf(ch)) != 0) {
                return false;
            }
        }
        return true;
    }
}
