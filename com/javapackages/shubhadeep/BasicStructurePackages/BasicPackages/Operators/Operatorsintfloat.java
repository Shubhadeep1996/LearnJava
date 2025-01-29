package com.javapackages.shubhadeep.BasicStructurePackages.BasicPackages.Operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operatorsintfloat {
    public static void main(String[] args) {
        // Integer operations
        int a = 10;
        int b = 5;
        System.out.println("Integer Operations:");
//        System.out.println("a + b = " + (a + b)); // Addition
//        System.out.println("a - b = " + (a - b)); // Subtraction
//        System.out.println("a * b = " + (a * b)); // Multiplication
//        System.out.println("a / b = " + (a / b)); // Division
//        System.out.println("a % b = " + (a % b)); // Modulus

        // Floating-point operations
        float x = 10.5f;
        float y = 5.2f;
        System.out.println("\nFloating-point Operations:");
        System.out.println("x + y = " + (x + y)); // Addition
//        System.out.println("x - y = " + (x - y)); // Subtraction
//        System.out.println("x * y = " + (x * y)); // Multiplication
//        System.out.println("x / y = " + (x / y)); // Division
//        System.out.println("x % y = " + (x % y)); // Modulus

        // BigDecimal operations
        BigDecimal bd1 = new BigDecimal("10.5");
        BigDecimal bd2 = new BigDecimal("5.2");
        System.out.println("\nBigDecimal Operations:");
        System.out.println("bd1 + bd2 = " + bd1.add(bd2)); // Addition
//        System.out.println("bd1 - bd2 = " + bd1.subtract(bd2)); // Subtraction
//        System.out.println("bd1 * bd2 = " + bd1.multiply(bd2)); // Multiplication
//        System.out.println("bd1 / bd2 = " + bd1.divide(bd2, 2, RoundingMode.HALF_UP)); // Division with rounding
//        System.out.println("bd1 % bd2 = " + bd1.remainder(bd2)); // Modulus
        BigDecimal bd3 = BigDecimal.valueOf(10.5f);
        BigDecimal bd4 = BigDecimal.valueOf(5.2f);
        System.out.println("bd3 + bd4 = " + bd3.add(bd4).setScale(2, RoundingMode.HALF_UP)); // Addition
        System.out.println("bd3 - bd4 = " + bd3.subtract(bd4).setScale(2, RoundingMode.HALF_UP)); // Subtraction
        System.out.println("bd3 * bd4 = " + bd3.multiply(bd4).setScale(2, RoundingMode.HALF_UP)); // Multiplication
        System.out.println("bd3 / bd4 = " + bd3.divide(bd4, 2, RoundingMode.HALF_UP)); // Division with rounding
        System.out.println("bd3 % bd4 = " + bd3.remainder(bd4).setScale(2, RoundingMode.HALF_UP)); // Modulus
    }
}