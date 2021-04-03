package org.dia.part01.lesson04.code;

import java.util.Scanner;

public class StudentGradeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your grade: ");
        double grade = sc.nextDouble();

        System.out.print("Hi, " + name + ". ");

        if (grade < 0 || grade > 100)   System.out.print("You've entered wrong value!");
        else if (grade > 91)            System.out.print("A");
        else if (grade > 81)            System.out.print("B");
        else if (grade > 71)            System.out.print("C");
        else if (grade > 61)            System.out.print("D");
        else if (grade > 51)            System.out.print("E");
        else                            System.out.print("F");
    }
}
