package com.wentjiang.leetcode.q901_1000;

import java.util.*;

public class Question981 {

}

// 使用二分查找还是会超时, 需要将TreeMap替换成其他的结构防止超市 46/53
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
            Integer index = binarySearch(tMap.keySet(), timestamp);
            if (index == null) {
                return "";
            } else {
                return tMap.get(index);
            }
        } else {
            String result = tMap.get(timestamp);
            return result == null ? "" : result;
        }
    }


    private Integer binarySearch(Set<Integer> times, int targetTime) {
        List<Integer> list = times.stream().toList();
        int lowIndex = 0;
        int highIndex = times.size() - 1;
        if (targetTime > list.get(highIndex)) {
            return list.get(highIndex);
        }
        while (lowIndex < highIndex) {
            if (targetTime > list.get(highIndex)) {
                return list.get(highIndex);
            }
            int middle = (highIndex - lowIndex + 1) / 2 + lowIndex;
            if (list.get(lowIndex) < targetTime && (lowIndex + 1 < times.size() && list.get(lowIndex + 1) > targetTime)) {
                return list.get(lowIndex);
            } else {
                if (lowIndex + 1 == highIndex) {
                    return null;
                }
                if (list.get(highIndex) > targetTime) {
                    highIndex = middle;
                } else if (list.get(lowIndex) < targetTime) {
                    lowIndex = middle + 1;
                }
            }

        }
        return null;
    }
}

