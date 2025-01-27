package com.javapackages.shubhadeep.ExercisePackages.ExerciseUserInput;

public class userinputex2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid input: Please provide two integers.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("Sum of the integers: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please provide valid integers.");
        }
    }
}