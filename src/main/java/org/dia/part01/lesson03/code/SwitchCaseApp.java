package org.dia.part01.lesson03.code;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthNumber = scan.nextInt();

        if      (monthNumber == 1)  System.out.println("JANUARY");
        else if (monthNumber == 2)  System.out.println("FEBRUARY");
        else if (monthNumber == 3)  System.out.println("MARCH");
        else if (monthNumber == 4)  System.out.println("APRIL");
        else if (monthNumber == 5)  System.out.println("MAY");
        else if (monthNumber == 6)  System.out.println("JUNE");
        else if (monthNumber == 7)  System.out.println("JULY");
        else if (monthNumber == 8)  System.out.println("AUGUST");
        else if (monthNumber == 9)  System.out.println("SEPTEMBER");
        else if (monthNumber == 10) System.out.println("OCTOBER");
        else if (monthNumber == 11) System.out.println("NOWEMBER");
        else if (monthNumber == 12) System.out.println("DECEMBER");
        else                        System.out.println("No month with this value: '" + monthNumber + "'. Wrong input!");

        switch (monthNumber) {
        case 1:                     System.out.println("JANUARY"); break;
        case 2:                     System.out.println("FEBRUARY"); break;
        case 3:                     System.out.println("MARCH"); break;
        case 4:                     System.out.println("APRIL"); break;
        case 5:                     System.out.println("MAY"); break;
        case 6:                     System.out.println("JUNE"); break;
        case 7:                     System.out.println("JULY"); break;
        case 8:                     System.out.println("AUGUST"); break;
        case 9:                     System.out.println("SEPTEMBER"); break;
        case 10:                    System.out.println("OCTOBER"); break;
        case 11:                    System.out.println("NOWEMBER"); break;
        case 12:                    System.out.println("DECEMBER"); break;
        default:                    System.out.println("No month with this value: '" + monthNumber + "'. Wrong input!");
        }






    }
}
