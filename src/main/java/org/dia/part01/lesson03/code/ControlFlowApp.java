package org.dia.part01.lesson03.code;

public class ControlFlowApp {
    public static void main1(String[] args) {

        int age = 15;
        boolean cond = age >= 18;

        if (age >= 18) {
            System.out.println("Satisha icaze verildi!");
        }

        if (!cond) {
            System.out.println("Satisha icaze verilmedi!");
        }

    }

    public static void main2(String[] args) {
        int x = 30;

        if (x < 20) {
            System.out.println("This is if statement");
        } else {
            System.out.println("This is else statement");
        }
        System.out.println("ABC123");

        boolean isRainy = false;
        if (isRainy) System.out.println("You have to take umbrella!");
        else System.out.println("You do not have to take umbrella!");

    }

    public static void main3(String[] args) {
        int seasonNumber = 4;
        if      (seasonNumber == 1) System.out.println("Spring");
        else if (seasonNumber == 2) System.out.println("Summer");
        else if (seasonNumber == 3) System.out.println("Autumn");
        else if (seasonNumber == 4) System.out.println("Winter");
        else                        System.out.println("No season with this value: " + seasonNumber);
    }

    public static void main(String[] args) {
        int monthNumber = 13;
        if (monthNumber == 1) System.out.println("JANUARY");
        else if (monthNumber == 2) System.out.println("FEBRUARY");
        else if (monthNumber == 12) System.out.println("DECEMBER");
        else System.out.println("No month with this value: '" + monthNumber + "'. Wrong input!");
    }

}