package com.wentjiang.leetcode.q901_1000;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question937 {
    public String[] reorderLogFiles(String[] logs) {
        List<String> stringLogs = new ArrayList<>();
        List<String> numberLogs = new ArrayList<>();
        for (String log : logs) {
            String[] strings = log.split(" ");
            Matcher isNum = Pattern.compile("-?[0-9]+").matcher(strings[1]);
            if (isNum.matches()) {
                numberLogs.add(log);
            } else {
                stringLogs.add(log);
            }
        }
        stringLogs.sort((o1, o2) -> {
            String subString1 = o1.substring(o1.indexOf(" ") + 1);
            String subString2 = o2.substring(o2.indexOf(" ") + 1);
            if (subString1.equals(subString2)) {
                return o1.split(" ")[0].compareTo(o2.split(" ")[0]);
            } else {
                return subString1.compareTo(subString2);
            }
        });
        stringLogs.addAll(numberLogs);
        return stringLogs.toArray(new String[] {});
    }
}
