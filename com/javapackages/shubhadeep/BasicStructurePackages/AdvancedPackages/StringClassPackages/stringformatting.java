package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.StringClassPackages;

public class stringformatting {
    public static void main(String[] args) {
        String name = "Shubhadeep";
        int age = 29;
        double salary = 100000.0;
        System.out.printf("Name: %s, Age: %d, Salary: %.2f", name, age, salary);

        System.out.println("\nString Formatting in Java:");
        System.out.printf("String: %s, Integer: %d, Float: %.2f, Character: %c, Boolean: %b, Newline: %n", "example", 42, 3.14159, 'A', true);

        // Documentation of String Formatting in Java

                /*
                 * String Formatting in Java:
                 *
                 * 1. Usage of `printf` and `format`:
                 *    - `System.out.printf` and `String.format` are used to format strings.
                 *    - Syntax: `System.out.printf(format, arguments)` or `String.format(format, arguments)`.
                 *
                 * 2. Common Format Specifiers:
                 *    - `%s`: Formats strings.
                 *    - `%d`: Formats decimal integers.
                 *    - `%f`: Formats floating-point numbers.
                 *    - `%c`: Formats characters.
                 *    - `%b`: Formats boolean values.
                 *    - `%n`: Inserts a newline character.
                 *
                 * 3. Width and Precision:
                 *    - Width: Specifies the minimum number of characters to be written to the output.
                 *      Example: `%10s` (minimum 10 characters wide).
                 *    - Precision: Specifies the number of digits after the decimal point for floating-point numbers.
                 *      Example: `%.2f` (2 digits after the decimal point).
                 *
                 * 4. Flags:
                 *    - `-`: Left-justifies the output within the specified width.
                 *    - `+`: Includes a plus sign for positive numbers.
                 *    - `0`: Pads the output with leading zeros.
                 *    - `,`: Includes grouping separators (e.g., thousands separator).
                 *
                 * 5. Examples:
                 *    - `System.out.printf("Name: %s, Age: %d, Salary: %.2f", name, age, salary);`
                 *      Output: `Name: Shubhadeep, Age: 21, Salary: 100000.00`
                 *    - `System.out.printf("Formatted number: %+08d", 123);`
                 *      Output: `Formatted number: +0000123`
                 *
                 * 6. Additional Notes:
                 *    - Escape sequences can be used within format strings (e.g., `\n` for newline).
                 *    - Format specifiers can be combined with text and other specifiers.
                 */
    }
}
