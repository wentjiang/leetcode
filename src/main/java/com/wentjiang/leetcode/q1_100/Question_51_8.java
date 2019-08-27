package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentaojiang
 * @date 2019-08-24 22:35
 * @description 八皇后问题
 */
public class Question_51_8 {

    public static void main(String[] args) {
        Question_51_8 question = new Question_51_8();
        System.out.println(question.solve8Queens());
    }

    public List<String> solve8Queens() {
        List<String> result = new ArrayList<>();
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessboard[i][j] = ".";
            }
        }

        for (int i = 0; i < 8; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                stringBuilder.append(chessboard[i][j]);
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }


}
