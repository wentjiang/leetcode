package com.wentjiang.leetcode.q1101_1200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1128 {

    /**
     * 暴力求解法,时间复杂度n平方,提交后计算超时
     *
     * @param dominoes
     * @return
     */
    public int numEquivDominoPairs(int[][] dominoes) {
        if (dominoes.length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < dominoes.length - 1; i++) {
            int[] dominoeI = dominoes[i];
            for (int j = i + 1; j < dominoes.length; j++) {
                int[] dominoeJ = dominoes[j];
                if ((dominoeI[0] == dominoeJ[0] && dominoeI[1] == dominoeJ[1]) ||
                        (dominoeI[1] == dominoeJ[0] && dominoeI[0] == dominoeJ[1])) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 使用map做缓存,每次遍历当前数字开头的所有数字的数组,时间复杂度,n平方,但相对于上边的写法有提升
     *
     * @param dominoes
     * @return
     */
    public int numEquivDominoPairs1(int[][] dominoes) {
        if (dominoes.length < 2) {
            return 0;
        }
        Map<Integer, List<Integer>> cache = new HashMap<>();
        int count = 0;
        for (int i = 0; i < dominoes.length; i++) {
            if (cache.get(dominoes[i][0]) != null) {
                for (int num : cache.get(dominoes[i][0])) {
                    if (num == dominoes[i][1]) {
                        count++;
                    }
                }
            }
            if (cache.get(dominoes[i][0]) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(dominoes[i][1]);
                cache.put(dominoes[i][0], list);
            } else {
                cache.get(dominoes[i][0]).add(dominoes[i][1]);
            }
            if (dominoes[i][0] != dominoes[i][1]) {
                if (cache.get(dominoes[i][1]) == null) {
                    List<Integer> list = new ArrayList<>();
                    list.add(dominoes[i][0]);
                    cache.put(dominoes[i][1], list);
                } else {
                    cache.get(dominoes[i][1]).add(dominoes[i][0]);
                }
            }
        }
        return count;
    }

    /**
     * 类似上边的方法使用嵌套map做缓存,时间复杂度n,代码复杂度过高,不做实现
     *
     * @param dominoes
     * @return
     */
    public int numEquivDominoPairs2(int[][] dominoes) {
        if (dominoes.length < 2) {
            return 0;
        }
        //第一个数       第二个数    出现次数
        Map<Integer, Map<Integer, Integer>> cache = new HashMap<>();

        return 0;
    }

    public int numEquivDominoPairs3(int[][] dominoes) {
        int count = 0;
        int[] val = new int[100];
        for (int[] dominoe : dominoes) {
            int index = dominoe[0] < dominoe[1] ? dominoe[0] * 10 + dominoe[1] : dominoe[1] * 10 + dominoe[0];
            count += val[index];
            val[index]++;
        }
        return count;
    }


}
