package com.wentjiang.leetcode.q401_500;

public class Question419 {
    public int countBattleships(char[][] board) {
        int lineNum = board.length;
        int colNum = board[0].length;
        int sum = 0;

        for (int i = 0; i < lineNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (board[i][j] == 'X') {
                    board[i][j] = '.';
                    for (int k = j + 1; k < colNum && board[i][k] == 'X'; ++k) {
                        board[i][k] = '.';
                    }
                    for (int k = i + 1; k < lineNum && board[k][j] == 'X'; ++k) {
                        board[k][j] = '.';
                    }
                    sum++;
                }
            }
        }
        return sum;
    }
}
