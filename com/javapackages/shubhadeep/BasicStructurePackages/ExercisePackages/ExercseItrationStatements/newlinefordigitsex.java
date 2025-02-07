package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExercseItrationStatements;

import java.util.Scanner;

public class newlinefordigitsex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please! Enter any Integer: ");
        int number = scanner.nextInt();

        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            System.out.println(numberString.charAt(i));
        }
    }
}
