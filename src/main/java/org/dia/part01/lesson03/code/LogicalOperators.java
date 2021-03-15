package org.dia.part01.lesson03.code;

public class LogicalOperators {
    public static void main(String[] args) {

        // -10
        boolean isEvenNumber = false;
        boolean isPositive = false;

        System.out.println(isEvenNumber && isPositive);  // false;
        System.out.println(isEvenNumber && !isPositive); // true;
        System.out.println(isEvenNumber || isPositive);  // true;

    }
}
