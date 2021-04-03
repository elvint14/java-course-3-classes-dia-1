package org.dia.part01.lesson04.code;

public class WhileApp {
    public static void main1(String[] args) {

        int a = 8;
        while (a < 10) {
            System.out.println(a);
            a++;
        }

        for (int b = 8; b < 10; b++) {
            System.out.println(b);
        }

        int c = 8;
        for (; c < 10; ) {
            System.out.println(c);
            c++;
        }
        System.out.println(c);

    }

    public static void main(String[] args) {
        int x = 10;
        while (x < 20) {
            System.out.print("Value of x : " + x);
            x++;
        }
    }
}
