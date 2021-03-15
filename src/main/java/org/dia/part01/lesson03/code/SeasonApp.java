package org.dia.part01.lesson03.code;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthNum = scan.nextInt();

        if (monthNum == 3 || monthNum == 4 || monthNum == 5)
            System.out.println("Spring");
        else if (monthNum == 6 || monthNum == 7 || monthNum == 8)
            System.out.println("Summer");
        else if (monthNum == 9 || monthNum == 10 || monthNum == 11)
            System.out.println("Autumn");
        else if (monthNum == 12 || monthNum == 1 || monthNum == 2)
            System.out.println("Winter");
    }
}
