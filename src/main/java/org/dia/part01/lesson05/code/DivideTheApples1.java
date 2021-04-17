package org.dia.part01.lesson05.code;

import java.util.Scanner;

public class DivideTheApples1 {
    public static void main(String[] args) {
        // 1. input:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 2. process:
        int numOfAppleForEachChild = k / n;

        // 3. output:
        System.out.println(numOfAppleForEachChild);
    }
}
