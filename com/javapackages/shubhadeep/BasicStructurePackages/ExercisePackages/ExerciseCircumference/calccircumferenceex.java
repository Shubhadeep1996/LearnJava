package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExerciseCircumference;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calccircumferenceex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Radius cannot be negative.");
            } else {
                double circumference = calculateCircumference(radius);
                System.out.println("Circumference of the circle: " + circumference);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }

    private static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}