package com.wentjiang.leetcode.q901_1000;

public class Question999 {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        int length = 8;
        int rookI = 0, rookJ = 0;
        //找车
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 'R') {
                    rookI = i;
                    rookJ = j;
                }
            }
        }

        //向上搜索
        for (int j = rookJ - 1; j >= 0; j--) {
            if (board[rookI][j] == 'p') {
                count++;
                break;
            }
            if (!(board[rookI][j] == '.')) {
                break;
            }
        }
        //向下搜索
        for (int j = rookJ + 1; j < 8; j++) {
            if (board[rookI][j] == 'p') {
                count++;
                break;
            }
            if (!(board[rookI][j] == '.')) {
                break;
            }
        }
        //向左搜索
        for (int i = rookI - 1; i >= 0; i--) {
            if (board[i][rookJ] == 'p') {
                count++;
                break;
            }
            if (!(board[i][rookJ] == '.')) {
                break;
            }
        }
        //向右搜索
        for (int i = rookI + 1; i < 8; i++) {
            if (board[i][rookJ] == 'p') {
                count++;
                break;
            }
            if (!(board[i][rookJ] == '.')) {
                break;
            }
        }
        return count;
    }
}
