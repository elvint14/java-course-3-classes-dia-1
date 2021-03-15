package org.dia.part01.lesson03.code;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        a = a + 1;  // 31
        a++;        // 32
        a = a + 5;  // 37
        a += 5;     // 42

        b = b - 1;  // 6
        b--;        // 5
        b = b - 2;  // 3
        b -= 2;     // 1

        System.out.println(a);
        System.out.println(b);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


    }
}
