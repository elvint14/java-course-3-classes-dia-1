package org.dia.part01.lesson03.code;

import java.util.Scanner;

public class UserInputApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your number:");
        int number = scan.nextInt();

        System.out.println("Your number: " + number*number);
        System.out.println("Your name:   " + name);
    }
}
