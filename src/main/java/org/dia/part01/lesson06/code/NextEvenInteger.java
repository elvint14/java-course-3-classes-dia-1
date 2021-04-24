package org.dia.part01.lesson06.code;

import java.util.Scanner;

public class NextEvenInteger {
    public static void main(String[] args) {
        // 1. input
        int num = new Scanner(System.in).nextInt();

        // 2. process
        int nextEven = getNextEven(num);

        // 3. output
        System.out.println(nextEven);
    }

    private static int getNextEven(int num) {
        return num + (num % 2 == 0 ? 2 : 1);
    }
}
