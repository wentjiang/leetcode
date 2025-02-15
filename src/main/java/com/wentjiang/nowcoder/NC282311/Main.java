package com.wentjiang.nowcoder.NC282311;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int max = Math.max(Math.max(x, y), z);
        int max2 = 0;
        if (max == x) {
            max2 += y + z;
        } else if (max == y) {
            max2 += x + z;
        } else if (max == z) {
            max2 += x + y;
        }
        int result = Math.max(max, max2);
        System.out.println(result);
    }
}
