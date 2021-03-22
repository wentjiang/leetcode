package com.wentjiang.leetcode.q1601_1700;

public class Question1603 {

}

class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    private int currentBig = 0;
    private int currentMedium = 0;
    private int currentSmall = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && currentBig < big) {
            currentBig++;
            return true;
        }
        if (carType == 2 && currentMedium < medium) {
            currentMedium++;
            return true;
        }
        if (carType == 3 && currentSmall < small) {
            currentSmall++;
            return true;
        }
        return false;
    }
}