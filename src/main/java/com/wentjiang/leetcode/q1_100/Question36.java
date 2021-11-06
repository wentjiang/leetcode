package com.wentjiang.leetcode.q1_100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/15 2:43 PM
 * 
 * @description
 */
public class Question36 {

    private final static int LENGTH = 9;

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < LENGTH; i++) {
            if (!isValidrow(board, i) || !isValidLine(board, i)) {
                return false;
            }
        }
        for (int i = 0; i < LENGTH; i = i + 3) {
            for (int j = 0; j < LENGTH; j = j + 3) {
                if (!isValidSquare(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 行判断
     */
    public boolean isValidrow(char[][] board, int row) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < LENGTH; i++) {
            char ch = board[row][i];
            if (ch == '.') {
                continue;
            }
            if (set.contains(ch)) {
                return false;
            } else {
                set.add(ch);
            }
        }
        return true;
    }

    /**
     * 列判断
     */
    public boolean isValidLine(char[][] board, int line) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < LENGTH; i++) {
            char ch = board[i][line];
            if (ch == '.') {
                continue;
            }
            if (set.contains(ch)) {
                return false;
            } else {
                set.add(ch);
            }
        }
        return true;
    }

    /**
     * 方格判断
     *
     * @param row
     *            开始行
     * @param line
     *            开始列
     */
    public boolean isValidSquare(char[][] board, int row, int line) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char ch = board[row + i][line + j];
                if (ch == '.') {
                    continue;
                }
                if (set.contains(ch)) {
                    return false;
                } else {
                    set.add(ch);
                }
            }
        }
        return true;
    }

}
