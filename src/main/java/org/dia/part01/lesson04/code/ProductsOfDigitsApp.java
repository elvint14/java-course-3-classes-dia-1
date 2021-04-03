package org.dia.part01.lesson04.code;

import java.util.Scanner;

public class ProductsOfDigitsApp {
    public static void mainV1(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // 235
        int firstDigit = num / 100;     // 235 / 100 = 2.35=> 2
        int midDigit = (num / 10) % 10; // (235/10)%10 = 23 % 10 = 3
        int lastDigit = num % 10;       // 235 % 10 = 23.5 => 5

        System.out.println(firstDigit * midDigit * lastDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int prod = 1;
        while (num > 0) {
            prod *= (num % 10);
            num /= 10;
        }

        System.out.println(prod);
    }
}
