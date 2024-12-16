package com.wentjiang.leetcode.q201_300;

public class Question264 {
    /**
     *      * 方法1: 直接循环计算,会导致超时
     *      * 方法2: 使用优先级队列, 穷举所有符合规则的丑数,直到访问到n
     *      * 方法3: 动态规划,三个指针,状态转移
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int count = 0;
        int value = 1;
        while(count < n){
            if (isUgly(value)){
                count++;
            }
            if (count == n){
                return value;
            }
            value++;
        }
        return 0;
    }


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
