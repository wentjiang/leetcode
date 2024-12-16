package com.wentjiang.leetcode.q1101_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        //找到最小差
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] - arr[i-1];
            if (min > temp){
                min = temp;
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]- arr[i-1] == min){
                List<Integer> list = new ArrayList<>(2);
                list.add(arr[i-1]);
                list.add(arr[i]);
                result.add(list);
            }
        }
        return result;
    }
}
