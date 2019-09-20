package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2019/9/19 11:48 AM
 * @description
 */
public class Question43 {

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        String sumResult = "0";
        for (int i = 0; i < num2.length(); i++) {
            char ch = num2.charAt(num2.length() - i - 1);
            String tempResult = add(ch, num1, i);
            sumResult = addSum(tempResult, sumResult);
        }
        return sumResult;
    }

    public String addSum(String tempResult, String sumResult) {
        StringBuilder stringBuilder = new StringBuilder();
        int tempLength = tempResult.length();
        int sumLength = sumResult.length();
        int minLength = Math.min(tempLength, sumLength);
        int maxLength = Math.max(tempLength, sumLength);
        boolean carry = false;
        for (int i = 0; i < maxLength - minLength; i++) {
            stringBuilder.append("0");
        }
        if (tempLength == minLength) {
            tempResult = stringBuilder.append(tempResult).toString();
        } else {
            sumResult = stringBuilder.append(sumResult).toString();
        }
        stringBuilder = new StringBuilder();
        for (int i = 1; i <= maxLength; i++) {
            int num = Integer.parseInt(String.valueOf(tempResult.charAt(maxLength - i)))
                + Integer.parseInt(String.valueOf(sumResult.charAt(maxLength - i)));
            if (carry) {
                carry = num / 10 == 1;
                num = num % 10 + 1;
                if (num == 10) {
                    carry = true;
                    num = 0;
                }
            } else {
                carry = num / 10 == 1;
                num = num % 10;
            }
            stringBuilder.insert(0, num);
        }
        if (carry) {
            stringBuilder.insert(0, 1);
        }
        return stringBuilder.toString();
    }

    private String add(char charAt, String num1, int zeroNum) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = num1.toCharArray();
        int carry = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int temp1 = Integer.parseInt(String.valueOf(chars[i]));
            int temp2 = Integer.parseInt(String.valueOf(charAt));
            int num = temp1 * temp2;
            num += carry;
            int unit = num % 10;
            carry = num / 10;
            stringBuilder.insert(0, unit);
        }
        for (int i = 0; i < zeroNum; i++) {
            stringBuilder.append("0");
        }
        if (carry != 0) {
            stringBuilder.insert(0, carry);
        }
        return stringBuilder.toString();
    }
}
