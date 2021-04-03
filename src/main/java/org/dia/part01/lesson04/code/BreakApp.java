package org.dia.part01.lesson04.code;

public class BreakApp {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 7) break;
            System.out.print(i + " ");
        }

        System.out.println("\nAfter for-loop");
    }
}
