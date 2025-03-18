package com.wentjiang.leetcode.q2601_2700;

import java.util.ArrayList;
import java.util.List;

public class Question2614 {
    public int diagonalPrime(int[][] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i][i]);
            if (i != nums.length - i - 1) {
                numList.add(nums[i][nums.length - i - 1]);
            }
        }
        numList.sort(Integer::compareTo);
        int maxResult = 0;
        for (int i = 0; i < numList.size(); i++) {
            int num = numList.get(numList.size() - 1 - i);
            if (isPrime(num)) {
                return num;
            }
        }
        return maxResult;
    }

    public boolean isPrime(int num) {
        if (num == 1){
            return false;
        }
        if (num <= 3) {
            return true;
        }
        for (int i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
