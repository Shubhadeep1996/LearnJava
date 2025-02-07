package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExercseItrationStatements;

import java.util.Scanner;

public class pyramidstarex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int number = scanner.nextInt();

        // Upper part of the pyramid
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pyramid
        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}