package com.javapackages.shubhadeep.BasicPackages.Operations;

public class Expressions {
    public static void main(String[] args) {
        // 1. Arithmetic Expressions
        int a = 10;
        int b = 5;
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);


        // 2. Relational Expressions
        boolean isEqual = (a == b); // Equal to
        boolean isNotEqual = (a != b); // Not equal to
        boolean isGreater = (a > b); // Greater than
        boolean isLess = (a < b); // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or equal to
        boolean isLessOrEqual = (a <= b); // Less than or equal to

        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less or Equal: " + isLessOrEqual);


        // 3. Logical Expressions
        boolean andExpression = (a > 0 && b > 0); // Logical AND
        boolean orExpression = (a > 0 || b > 0); // Logical OR
        boolean notExpression = !(a > 0); // Logical NOT

        System.out.println("AND Expression: " + andExpression);
        System.out.println("OR Expression: " + orExpression);
        System.out.println("NOT Expression: " + notExpression);


        // 4. Bitwise Expressions
        int bitwiseAnd = a & b; // Bitwise AND
        int bitwiseOr = a | b; // Bitwise OR
        int bitwiseXor = a ^ b; // Bitwise XOR
        int bitwiseNot = ~a; // Bitwise NOT
        int leftShift = a << 1; // Left shift
        int rightShift = a >> 1; // Right shift
        int unsignedRightShift = a >>> 1; // Unsigned right shift

        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT: " + bitwiseNot);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
        System.out.println("Unsigned Right Shift: " + unsignedRightShift);


        // 5. Assignment Expressions
        int c = 10; // Simple assignment
        c += 5; // Add and assign
        c -= 3; // Subtract and assign
        c *= 2; // Multiply and assign
        c /= 4; // Divide and assign
        c %= 3; // Modulus and assign
        c &= 2; // Bitwise AND and assign
        c |= 4; // Bitwise OR and assign
        c ^= 3; // Bitwise XOR and assign
        System.out.println("Assignment: " + c);


        // 6. Conditional (Ternary) Expressions
        int max = (a > b) ? a : b; // Ternary operator

        System.out.println("Max: " + max);

        // 7. Instanceof Expressions
        String str = "Hello";
        boolean isString = str instanceof String; // Check if str is an instance of String
        System.out.println("Is String: " + isString);

    }
}