package com.wentjiang.leetcode.utils;

import java.net.URISyntaxException;

public class QuestionCounter {

    public int countQuestions(String scanPackage) {
        int count = 0;
        try {
            count += ClassUtil.getScanPackageClassName(scanPackage).size();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {
        QuestionCounter counter = new QuestionCounter();
        int count = counter.countQuestions("com.wentjiang.leetcode");
        System.out.println("total count : " + count);
    }
}
