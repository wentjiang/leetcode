package com.wentjiang.leetcode.q1_100;

public class Question12_1 {
    public String intToRoman(int num) {
        int num4 = num / 1000;
        int num3 = (num % 1000) / 100;
        int num2 = (num % 100) / 10;
        int num1 = num % 10;
        StringBuilder result = new StringBuilder();
        if (num4 != 0) {
            switch (num4) {
                case 1:
                    result.append("M");
                    break;
                case 2:
                    result.append("MM");
                    break;
                case 3:
                    result.append("MMM");
                    break;
            }
        }
        if (num3 != 0) {
            switch (num3) {
                case 9:
                    result.append("CM");
                    break;
                case 8:
                    result.append("DCCC");
                    break;
                case 7:
                    result.append("DCC");
                    break;
                case 6:
                    result.append("DC");
                    break;
                case 5:
                    result.append("D");
                    break;
                case 4:
                    result.append("CD");
                    break;
                case 3:
                    result.append("CCC");
                    break;
                case 2:
                    result.append("CC");
                    break;
                case 1:
                    result.append("C");
                    break;
            }
        }
        if (num2 != 0) {
            switch (num2) {
                case 9:
                    result.append("XC");
                    break;
                case 8:
                    result.append("LXXX");
                    break;
                case 7:
                    result.append("LXX");
                    break;
                case 6:
                    result.append("LX");
                    break;
                case 5:
                    result.append("L");
                    break;
                case 4:
                    result.append("XL");
                    break;
                case 3:
                    result.append("XXX");
                    break;
                case 2:
                    result.append("XX");
                    break;
                case 1:
                    result.append("X");
                    break;
            }
        }
        if (num1 != 0) {
            switch (num1) {
                case 9:
                    result.append("IX");
                    break;
                case 8:
                    result.append("VIII");
                    break;
                case 7:
                    result.append("VII");
                    break;
                case 6:
                    result.append("VI");
                    break;
                case 5:
                    result.append("V");
                    break;
                case 4:
                    result.append("IV");
                    break;
                case 3:
                    result.append("III");
                    break;
                case 2:
                    result.append("II");
                    break;
                case 1:
                    result.append("I");
                    break;
            }
        }

        return result.toString();
    }
}
