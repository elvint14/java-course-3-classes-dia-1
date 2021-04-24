package org.dia.part01.lesson06.code;

public class MethodApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = -3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a*2);
        System.out.println(b*2);
        System.out.println(c*2);

//        if (a % 2 == 0) System.out.println("EVEN");
//        else System.out.println("ODD");
//
//        if (b % 2 == 0) System.out.println("EVEN");
//        else System.out.println("ODD");
//
//        if (c % 2 == 0) System.out.println("EVEN");
//        else System.out.println("ODD");

        isEven(a);
        isEven(b);
        isEven(c);

    }

    public static void isEven(int number) {
        if (number % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}