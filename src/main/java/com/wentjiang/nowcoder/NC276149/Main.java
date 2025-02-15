package com.wentjiang.nowcoder.NC276149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 2) {
            System.out.println("YES");
            int num2 = num - 1;
            System.out.println(1 + " " + num2);
        } else {
            System.out.println("NO");
        }
    }
}

