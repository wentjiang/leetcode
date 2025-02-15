package com.wentjiang.nowcoder.OD;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String charString = input.next();
        String[] strings = charString.split(",");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if ("1".equals(strings[i])) {
                count++;
                if (i + 1 < strings.length && "1".equals(strings[i + 1])) {
                    i++;
                    if (i + 2 < strings.length && "1".equals(strings[i + 2])) {
                        i++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
