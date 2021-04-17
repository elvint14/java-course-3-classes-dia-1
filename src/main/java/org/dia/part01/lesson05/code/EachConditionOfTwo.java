package org.dia.part01.lesson05.code;

import java.util.Scanner;

public class EachConditionOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean first = (n % 3) == 0;
        boolean second = (n % 2) == 0;
        boolean third = (n > 9 && n < 100) || (n < -9 && n > -100);

        if (first && (second && third)) System.out.println("YES");
        else System.out.println("NO");
    }
}