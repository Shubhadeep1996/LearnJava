package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExerciseAreaOfTriangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class areaoftriex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter length of side A of the triangle: ");
            double A = scanner.nextDouble();

            System.out.println("Enter length of side B of the triangle: ");
            double B = scanner.nextDouble();

            System.out.println("Enter length of side C of the triangle: ");
            double C = scanner.nextDouble();

            if (!isValidTriangle(A, B, C)) {
                System.out.println("NaN");
            } else {
                double area = calculateArea(A, B, C);
                System.out.println("Area of the triangle: " + area);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }

    private static boolean isValidTriangle(double A, double B, double C) {
        return (A + B > C) && (A + C > B) && (B + C > A);
    }

    private static double calculateArea(double A, double B, double C) {
        double s = (A + B + C) / 2;
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }
}