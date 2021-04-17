package org.dia.part01.lesson05.code;

import java.util.Scanner;

public class MaximumAmongFourNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int maxA_B = Math.max(a, b);
        int maxC_D = Math.max(c, d);

        int max = Math.max(
                maxA_B,
                maxC_D
        );

        System.out.println(max);
    }
}
