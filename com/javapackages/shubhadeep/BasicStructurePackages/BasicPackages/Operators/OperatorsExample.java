package com.javapackages.shubhadeep.BasicStructurePackages.BasicPackages.Operators;
import java.util.Scanner;


public class OperatorsExample {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        // Arithmetic Operators
        int a = 10;
        int b = 5;
        // System.out.print("Enter value for a: ");
        // a = scanner.nextInt();
        // System.out.print("Enter value for b: ");
        // b = scanner.nextInt();
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Assignment Operators
        int e = 10;
        // System.out.print("Enter value for e: ");
        // e = scanner.nextInt();
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);
        e -= 3; // e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2; // e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 4; // e = e / 4
        System.out.println("e /= 4: " + e);
        e %= 3; // e = e % 3
        System.out.println("e %= 3: " + e);

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        // System.out.print("Enter value for x (true/false): ");
        // x = scanner.nextBoolean();
        // System.out.print("Enter value for y (true/false): ");
        // y = scanner.nextBoolean();
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Bitwise Operators
        int c = 6; // 110 in binary
        int d = 4; // 100 in binary
        // System.out.print("Enter value for c: ");
        // c = scanner.nextInt();
        // System.out.print("Enter value for d: ");
        // d = scanner.nextInt();
        System.out.println("c & d: " + (c & d)); // Bitwise AND
        System.out.println("c | d: " + (c | d)); // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d)); // Bitwise XOR
        System.out.println("~c: " + (~c)); // Bitwise NOT
        System.out.println("c << 1: " + (c << 1)); // Left shift
        System.out.println("c >> 1: " + (c >> 1)); // Right shift
        System.out.println("c >>> 1: " + (c >>> 1)); // Unsigned right shift

        /*
         * Explanation of Bitwise Shift Operators:
         *
         * 1. Left Shift (<<):
         *    - Syntax: x << y
         *    - Shifts the bits of 'x' to the left by 'y' positions.
         *    - Each shift to the left is equivalent to multiplying 'x' by 2.
         *    - Formula: x << y = x * 2^y
         *    - Example: 6 << 1 (110 << 1) results in 12 (1100 in binary).
         *
         * 2. Right Shift (>>):
         *    - Syntax: x >> y
         *    - Shifts the bits of 'x' to the right by 'y' positions.
         *    - Each shift to the right is equivalent to dividing 'x' by 2.
         *    - Formula: x >> y = x / 2^y
         *    - Example: 6 >> 1 (110 >> 1) results in 3 (11 in binary).
         *
         * 3. Unsigned Right Shift (>>>):
         *    - Syntax: x >>> y
         *    - Shifts the bits of 'x' to the right by 'y' positions, filling with zeros.
         *    - This operator is used for unsigned binary numbers.
         *    - Example: -6 >>> 1 results in a large positive number due to zero fill.
         */

        // Ternary Operator
        int h = (a > b) ? a : b;
        System.out.println("Ternary (a > b) ? a : b: " + h);

        // Operator Precedence
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("a + b * c = " + result);
        result = (a + b) * c; // Parentheses change the precedence
        System.out.println("(a + b) * c = " + result);
    }
}