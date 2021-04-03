package org.dia.part01.lesson04.code;

public class DoWhileApp {
    public static void main1(String[] args) {

        int i = 20;
        while (i < 20) {
            System.out.println(i);
            i++;
        }

        System.out.println(i); // 20

        do {
            System.out.println(i); // 20
            i++;                   // i = 21
        } while (i < 20);

        System.out.println(i); // 21

    }

    public static void main(String[] args) {

        // while-do loop
//        int i = 20;
//        while (i < 20)
//        do {
//            System.out.println(i);
//            i++;
//        };

        // do-while loop
        int j = 20;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 20);

    }
}
