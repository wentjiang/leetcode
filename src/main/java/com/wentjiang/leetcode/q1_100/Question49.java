package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentao.jiang
 * @date 2019/11/14 5:37 PM
 * @description
 */
public class Question49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            List<String> list = map.get(key);
            if (list == null){
                list = new ArrayList<>();
            }
            list.add(str);
            map.put(key,list);
        }
        map.forEach((key, value) -> result.add(value));

        return result;
    }

}
