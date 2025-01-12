package com.wentjiang.leetcode.q901_1000;

import java.util.*;

public class Question981 {

}

class TimeMap {

    //          key         time    value
    private Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (timeMap.containsKey(key)) {
            timeMap.get(key).put(timestamp, value);
        } else {
            TreeMap<Integer, String> map = new TreeMap<>();
            map.put(timestamp, value);
            timeMap.put(key, map);
        }
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tMap = timeMap.get(key);

        if (tMap.get(timestamp) == null) {
            int maxTime = 0;
            for (int time : tMap.keySet()) {
                if (time < timestamp) {
                    maxTime = time;
                } else {
                    break;
                }
            }
            String result = tMap.get(maxTime);
            return result == null ? "" : result;
        } else {
            String result = tMap.get(timestamp);
            return result == null ? "" : result;
        }
    }

}

