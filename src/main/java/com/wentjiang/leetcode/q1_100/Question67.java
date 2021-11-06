package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * 
 * @date 2019/9/21 12:50 PM
 * 
 * @description
 */
public class Question67 {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        if ("0".equals(a)) {
            return b;
        }
        if ("0".equals(b)) {
            return a;
        }
        int aLength = a.length();
        int bLength = b.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Math.abs(bLength - aLength); i++) {
            stringBuilder.append("0");
        }
        if (aLength < bLength) {
            a = stringBuilder.append(a).toString();
        } else {
            b = stringBuilder.append(b).toString();
        }
        boolean carry = false;
        for (int i = Math.max(aLength, bLength) - 1; i >= 0; i--) {
            int sum = 0;
            int aChar = Integer.parseInt(String.valueOf(a.charAt(i)));
            int bChar = Integer.parseInt(String.valueOf(b.charAt(i)));
            sum += aChar + bChar;
            if (carry) {
                sum += 1;
            }
            if (sum == 0) {
                result.insert(0, 0);
                carry = false;
            } else if (sum == 1) {
                result.insert(0, 1);
                carry = false;
            } else if (sum == 2) {
                result.insert(0, 0);
                carry = true;
            } else if (sum == 3) {
                result.insert(0, 1);
                carry = true;
            }
        }
        if (carry) {
            result.insert(0, 1);
        }
        return result.toString();
    }

}
