package org.dia.part01.lesson06.code;

public class MethodApp2 {
    public static void main(String[] args) {
        //1 no arg. & no return
        printHello();
        printHello();
        printHello();

        //2 no return
        printNum(2, null);
        printNum(100, null);
        printNum(-100, null);
        printNum(-100, "Elvin");

        //3 no arg
        double randomNum1 = getRandomNum();
        double randomNum2 = getRandomNum();
        double randomNum3 = getRandomNum();
        System.out.println(randomNum1);
        System.out.println(randomNum2);
        System.out.println(randomNum3);

        //4
        boolean isEven1 = isEven(10);
        boolean isEven2 = isEven(1);
        boolean isEven3 = isEven(19);
        System.out.println(isEven1);
        System.out.println(isEven2);
        System.out.println(isEven3);
    }

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void printNum(int num, String name) {
        System.out.println(num * num + " " + name);
    }

    public static double getRandomNum() {
        return Math.random() * 100;
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
