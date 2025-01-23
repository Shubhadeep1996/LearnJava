package com.javapackages.shubhadeep.BasicPackages.MathClass;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Absolute value
        System.out.print("Enter a number for absolute value: ");
        int absInput = scanner.nextInt();
        int absValue = Math.abs(absInput);
        // System.out.println("Absolute value of " + absInput + ": " + absValue);

        // Maximum of two numbers
        System.out.print("Enter first number for max: ");
        int maxInput1 = scanner.nextInt();
        System.out.print("Enter second number for max: ");
        int maxInput2 = scanner.nextInt();
        int maxValue = Math.max(maxInput1, maxInput2);
        // System.out.println("Maximum of " + maxInput1 + " and " + maxInput2 + ": " + maxValue);

        // Minimum of two numbers
        System.out.print("Enter first number for min: ");
        int minInput1 = scanner.nextInt();
        System.out.print("Enter second number for min: ");
        int minInput2 = scanner.nextInt();
        int minValue = Math.min(minInput1, minInput2);
        // System.out.println("Minimum of " + minInput1 + " and " + minInput2 + ": " + minValue);

        // Square root
        System.out.print("Enter a number for square root: ");
        double sqrtInput = scanner.nextDouble();
        double sqrtValue = Math.sqrt(sqrtInput);
        // System.out.println("Square root of " + sqrtInput + ": " + sqrtValue);

        // Power
        System.out.print("Enter base number for power: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent for power: ");
        double exponent = scanner.nextDouble();
        double powerValue = Math.pow(base, exponent);
        // System.out.println(base + " raised to the power of " + exponent + ": " + powerValue);

        // Rounding
        System.out.print("Enter a number for rounding: ");
        double roundInput = scanner.nextDouble();
        long roundValue = Math.round(roundInput);
        // System.out.println("Rounding " + roundInput + ": " + roundValue);

        // Ceiling
        System.out.print("Enter a number for ceiling: ");
        double ceilInput = scanner.nextDouble();
        double ceilValue = Math.ceil(ceilInput);
        // System.out.println("Ceiling of " + ceilInput + ": " + ceilValue);

        // Floor
        System.out.print("Enter a number for floor: ");
        double floorInput = scanner.nextDouble();
        double floorValue = Math.floor(floorInput);
        // System.out.println("Floor of " + floorInput + ": " + floorValue);

        // Trigonometric functions
        System.out.print("Enter an angle in degrees for sine: ");
        double sinInput = scanner.nextDouble();
        double sinValue = Math.sin(Math.toRadians(sinInput));
        // System.out.println("Sine of " + sinInput + " degrees: " + sinValue);

        System.out.print("Enter an angle in degrees for cosine: ");
        double cosInput = scanner.nextDouble();
        double cosValue = Math.cos(Math.toRadians(cosInput));
        // System.out.println("Cosine of " + cosInput + " degrees: " + cosValue);

        System.out.print("Enter an angle in degrees for tangent: ");
        double tanInput = scanner.nextDouble();
        double tanValue = Math.tan(Math.toRadians(tanInput));
        // System.out.println("Tangent of " + tanInput + " degrees: " + tanValue);

        // Logarithm
        System.out.print("Enter a number for natural logarithm: ");
        double logInput = scanner.nextDouble();
        double logValue = Math.log(logInput);
        // System.out.println("Natural logarithm of " + logInput + ": " + logValue);

        System.out.print("Enter a number for base 10 logarithm: ");
        double log10Input = scanner.nextDouble();
        double log10Value = Math.log10(log10Input);
        // System.out.println("Base 10 logarithm of " + log10Input + ": " + log10Value);

        // Exponential
        System.out.print("Enter a number for exponential: ");
        double expInput = scanner.nextDouble();
        double expValue = Math.exp(expInput);
        // System.out.println("Exponential of " + expInput + ": " + expValue);

        // Random number
        double randomValue = Math.random();
        // System.out.println("Random number between 0.0 and 1.0: " + randomValue);

        scanner.close();
    }
}