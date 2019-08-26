package com.wentjiang.leetcode;

/**
 * @author wentaojiang
 * @date 2019/4/8 7:58 PM
 * @description
 */
public class Question7 {
    public static int reverse(int x) {
        boolean b = false;
        if (x < 0) {
            b = true;
        }
        x = Math.abs(x);
        String rx = String.valueOf(x);
        char[] chs = rx.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chs.length - 1; i >= 0; i--) {
            if (sb.length() != 0 || chs[i] != '0') {
                sb.append(chs[i]);
            }
        }
        if (b) {
            sb.insert(0, "-");
        }

        if (sb.toString().equals("-") || sb.toString().equals("")) {
            sb.append("0");
        }
        try {
            return Integer.parseInt(sb.toString());

        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
