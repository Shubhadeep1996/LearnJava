package com.javapackages.shubhadeep.ExercisePackages.ExerciseUserInput;
import java.util.Scanner;

public class userinputex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        try{
            if(num1 > 0 && num2 > 0){
                System.out.println("Both numbers are positive");
                double num3 = num1 * num2;
                double num4 = num1 / num2;
                double num5 = num1 + num2;
                double num6 = num1 - num2;
                System.out.println("Multiplication of the numbers: " + num3);
                System.out.println("Division of the numbers: " + num4);
                System.out.println("Addition of the numbers: " + num5);
                System.out.println("Subtraction of the numbers: " + num6);
            }else if (num1 < 0 && num2 < 0){
                System.out.println("Both numbers are negative");
                double num3 = num1 * num2;
                double num4 = num1 / num2;
                double num5 = num1 + num2;
                double num6 = num1 - num2;
                System.out.println("Multiplication of the numbers: " + num3);
                System.out.println("Division of the numbers: " + num4);
                System.out.println("Addition of the numbers: " + num5);
                System.out.println("Subtraction of the numbers: " + num6);
            }else if (num1 < 0 || num2 < 0){
                System.out.println("One of the numbers is negative");
                double num3 = num1 * num2;
                double num4 = num1 / num2;
                double num5 = num1 + num2;
                double num6 = num1 - num2;
                System.out.println("Multiplication of the numbers: " + num3);
                System.out.println("Division of the numbers: " + num4);
                System.out.println("Addition of the numbers: " + num5);
                System.out.println("Subtraction of the numbers: " + num6);
            }else if (num1 == 0 || num2 == 0){
                System.out.println("One of the numbers is zero");
                double num3 = num1 * num2;
                double num4 = num1 / num2;
                double num5 = num1 + num2;
                double num6 = num1 - num2;
                System.out.println("Multiplication of the numbers: " + num3);
                System.out.println("Division of the numbers: " + num4);
                System.out.println("Addition of the numbers: " + num5);
                System.out.println("Subtraction of the numbers: " + num6);
            }else{
                System.out.println("Both numbers are zero");
            }
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
