package com.wentjiang.nowcoder.OD.interview;

import java.util.List;

//LED布局
//给你一个 rows x cols y 的LED屏和一个用 非空 的单词列表组成的句子，请你进行布局，输出给定句子可以在LED屏上完整显示的次数
//        输入
//LED屏行数rows    LED屏列数cols
//非空的单词列表sentence
//        输出
//给定句子可以在LED屏上的完整显示的次数
//        样例1
//复制输入：
//        2 8 hello world
//复制输出：
//        1
//解释：
//输入：
//sentence = ["hello", "world"], rows = 2, cols = 8
//输出：
//        1
//解释：
//hello---
//world---
//字符 '-' 表示屏幕上的一个空白位置
//        样例2
//复制输入：
//        3 6 a bcd e
//复制输出：
//        2
//解释：
//输入：
//sentence = ["a", "bcd", "e"], rows = 3, cols = 6
//输出：
//        2
//解释：
//a-bcd-
//e-a---
//bcd-e-
//字符 '-' 表示屏幕上的一个空白位置
//        样例3
//复制输入：
//        4 5 I had apple pie
//复制输出：
//        1
//解释：
//输入：
//sentence = ["I", "had", "apple", "pie"], rows = 4, cols = 5
//输出：
//        1
//解释：
//I-had
//        apple
//pie-I
//had--
//字符 '-' 表示屏幕上的一个空白位置。
//提示
//        一个单词不能拆分成两行
//单词在句子中的顺序必须保持不变
//在一行中 的两个连续单词必须用一个空格符分隔
//句子中的单词总量不会超过 100
//每个单词的长度大于 0 且不会超过 10
//        1 ≤ rows, cols ≤ 20000
public class Question2 {

    public static int getResult(int x, int y, String[] sentences) {
        int currentIndex = 0;
        int wordsCount = sentences.length;
        for (int i = 0; i < x; i++) {
            int lineIndex = 0;
            while (lineIndex < y && sentences[currentIndex % wordsCount].length() <= (y - lineIndex)) {
                String word = sentences[currentIndex % wordsCount];
                lineIndex += word.length() + 1;
                currentIndex++;
            }
        }
        return currentIndex / wordsCount;
    }

}
