package org.dia.part01.lesson04.code;

public class ContinueApp {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 7) continue;
            System.out.print(i + " ");
        }

        System.out.println("\nAfter for-loop");
    }
}
