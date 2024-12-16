package com.wentjiang.leetcode.q201_300;

public class Question263 {

    /**
     * @param n
     * @return
     */
    public boolean isUgly(int n) {
        if (n == 0){
            return false;
        }
        boolean divideBy2 = true;
        boolean divideBy3 = true;
        boolean divideBy5 = true;
        while (divideBy3 || divideBy2 || divideBy5) {
            if (divideBy3) {
                if (n % 3 == 0) {
                    n /= 3;
                } else {
                    divideBy3 = false;
                }
            }
            if (divideBy5) {
                if (n % 5 == 0) {
                    n /= 5;
                } else {
                    divideBy5 = false;
                }
            }
            if (divideBy2) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    divideBy2 = false;
                }
            }
        }
        return n == 1;
    }
}
