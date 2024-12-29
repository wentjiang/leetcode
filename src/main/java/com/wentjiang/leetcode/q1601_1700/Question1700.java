package com.wentjiang.leetcode.q1601_1700;

public class Question1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int s0Count = 0;
        int s1Count = 0;
        for (int student : students) {
            if (student == 0) {
                s0Count++;
            } else {
                s1Count++;
            }
        }
        for (int i = 0; i < sandwiches.length; i++) {
            int current = sandwiches[i];
            if (current == 0 && s0Count > 0) {
                s0Count--;
            } else if (current == 1 && s1Count > 0) {
                s1Count--;
            } else {
                break;
            }
        }
        return s0Count + s1Count;
    }
}
