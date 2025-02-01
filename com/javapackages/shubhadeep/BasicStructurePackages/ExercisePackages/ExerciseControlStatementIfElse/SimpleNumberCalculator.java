package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExerciseControlStatementIfElse;

public class SimpleNumberCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }

        try {
            if (args[0].contains(".") || args[1].contains(".")) {
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);
                double result = num1 + num2;
                System.out.println("The result is: " + result);
            } else {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int result = num1 + num2;
                System.out.println("The result is: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid numbers.");
        }
    }
}