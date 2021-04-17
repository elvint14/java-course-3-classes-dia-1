package org.dia.part01.lesson05.code;

import java.util.Scanner;

public class DivideTheApples2 {
    public static void main(String[] args) {
        // 1. input:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 2. process:
        int numOfAppleInBasket = k % n;

        // 3. output:
        System.out.println(numOfAppleInBasket);
    }
}
