package com.wentjiang.leetcode.q1501_1600;

public class Question1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int leftBottles = 0;
        while ((numBottles + leftBottles) >= numExchange) {
            sum += (numBottles + leftBottles) / numExchange;
            int newLeftBottles = (numBottles + leftBottles)% numExchange;
            numBottles = (numBottles + leftBottles) / numExchange;
            leftBottles = newLeftBottles;
        }
        return sum;
    }
}
