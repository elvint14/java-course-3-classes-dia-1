package org.dia.part01.lesson05.code;

import java.util.Scanner;

public class CityNumbers {
    public static void main(String[] args) {
        // 1. input:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if ((n % 2) != (m % 2)) System.out.println(0);
        else                    System.out.println(1);
    }
}
