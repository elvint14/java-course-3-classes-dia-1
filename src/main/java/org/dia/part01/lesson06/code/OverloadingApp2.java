package org.dia.part01.lesson06.code;

public class OverloadingApp2 {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(2.3,6.2));
        System.out.println(sum(2.3F,6.2f));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(float a, float b) {
        return a + b;
    }

}
