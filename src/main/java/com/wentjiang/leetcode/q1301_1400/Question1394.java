package com.wentjiang.leetcode.q1301_1400;

import java.util.HashMap;
import java.util.Map;

public class Question1394 {
    public int findLucky(int[] arr) {
        int[] temp = new int[500];
        int max = -1;
        for (int n : arr) {
            temp[n - 1] += 1;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == i + 1) {
                max = i + 1;
            }
        }
        return max;
    }

    public int findLucky1(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        int result = -1;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                result = entry.getKey();
            }
        }
        return result;
    }
}
