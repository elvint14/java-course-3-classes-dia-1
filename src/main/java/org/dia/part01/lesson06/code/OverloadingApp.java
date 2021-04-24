package org.dia.part01.lesson06.code;

public class OverloadingApp {
    public static void main(String[] args) {

        System.out.println(5);
        System.out.println(5.5);
        System.out.println(true);
        System.out.println('a');
        System.out.println("Elvin Taghizade");

        print(5);
        print(5.5);
        print(true);
        print('a');
        print("Elvin");
    }

    public static void print(int n) {
        System.out.println(n);
    }

    public static void print(double n) {
        System.out.println(n);

    }

    public static void print(boolean n) {
        System.out.println(n);

    }

    public static void print(char n) {
        System.out.println(n);

    }

    public static void print(String n) {
        System.out.println(n);

    }
}
