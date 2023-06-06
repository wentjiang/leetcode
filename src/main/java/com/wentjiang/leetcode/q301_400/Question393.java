package com.wentjiang.leetcode.q301_400;

import java.util.ArrayList;
import java.util.List;

public class Question393 {
    public boolean validUtf8(int[] data) {
        List<String> list = new ArrayList<>(data.length);
        for (int num : data) {
            String binaryString = Integer.toBinaryString(num);
            if (binaryString.length() < 8) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 8 - binaryString.length(); i++) {
                    sb.append(0);
                }
                sb.append(binaryString);
                list.add(sb.toString());
            } else {
                list.add(binaryString);
            }
        }
        int index = 0;
        while (true) {
            String str = list.get(index);
            // 0开头,只有一个字节
            if (list.get(index).startsWith("0")) {
                index++;
                // 1开头,有多个字节
            } else if (list.get(index).startsWith("10")) {
                return false;
            } else {
                char[] chars = str.toCharArray();
                int oneNum = 0;
                for (char ch : chars) {
                    if (ch == '1') {
                        oneNum++;
                    } else {
                        break;
                    }
                    if (oneNum > 4) {
                        return false;
                    }
                }
                for (int i = 1; i < oneNum; i++) {
                    if (index + i >= data.length) {
                        return false;
                    } else {
                        if (!list.get(index + i).startsWith("10")) {
                            return false;
                        }
                    }
                }
                index += oneNum;
            }

            if (index >= data.length) {
                break;
            }
        }
        return true;
    }
}
