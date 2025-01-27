package com.javapackages.shubhadeep.AdvancedPackages.StringClassPackages;

public class stringobject {
    public static void main(String[] args) {
        // Print an empty line
        System.out.println();
        // Print a header for the String Object section
        System.out.println("=============String Object==============");
        // Print another empty line
        System.out.println();

        // Create a String object with leading and trailing spaces
        String str = " Hello ";
        // Print the length of the string, which includes spaces
        System.out.println("String length: " + str.length()); // 7
        // Check if the string contains the substring "Hello"
        System.out.println("String Contains: " + str.contains("Hello")); // True
        // Check if the string is empty
        System.out.println("str.isEmpty() : " + str.isEmpty()); // False
        // Convert the string to uppercase
        System.out.println("str.toUpperCase() : " + str.toUpperCase()); // HELLO
        // Check if the string starts with "He"
        System.out.println("str.startsWith(\"He\") : " + str.startsWith("He")); // False
        // Check if the string ends with a space
        System.out.println("str.endsWith(\" \") : " + str.endsWith(" ")); // True
        // Replace "He" with "Hi" in the string
        System.out.println("str.replace(\"He\", \"Hi\") : " + str.replace("He", "Hi")); // Hi llo
        // Trim leading and trailing spaces from the string
        System.out.println("str.trim() : " + str.trim()); // Hello
        // Strip leading and trailing spaces from the string (Java 11+)
        System.out.println("str.strip() : " + str.strip()); // Hello
        // Get a substring from index 1 to 4
        System.out.println("str.substring(1, 4) : " + str.substring(1, 4)); // ell
        // Convert the string to a byte array and print it
        System.out.println("Arrays.toString(str.getBytes()) : " + java.util.Arrays.toString(str.getBytes())); // [32, 72, 101, 108, 108, 111, 32]
        // Convert the string to a char array and print it
        System.out.println("Arrays.toString(str.toCharArray()) : " + java.util.Arrays.toString(str.toCharArray())); // [ , H, e, l, l, o,  ]
        // Get the character at index 1
        System.out.println("str.charAt(1) : " + str.charAt(1)); // e
        // Split the string by "e" and print the resulting array
        System.out.println("Arrays.toString(str.split(\"e\")) : " + java.util.Arrays.toString(str.split("e"))); // [ H, llo ]
        // Print the original string
        System.out.println("str: " + str); // Hello

        // Print an empty line
        System.out.println();
        // Print a header for the String Comparison section
        System.out.println("=============String Comparison==============");
        // Print another empty line
        System.out.println();

        // Create a new String object
        String str1 = "Hello";
        // Check if str is equal to str1
        System.out.println("str.equals(str1) : " + str.equals(str1)); // True
        // Check if str and str1 refer to the same object
        System.out.println("str == str1 : " + (str == str1)); // True
        // Create another String object with the same value
        String str2 = "Hello";
        // Check if str is equal to str2
        System.out.println("str.equals(str2) : " + str.equals(str2)); // True
        // Check if str and str2 refer to the same object
        System.out.println("str == str2 : " + (str == str2)); // True
        // Check if str and the interned str2 refer to the same object
        System.out.println("str == str2.intern() : " + (str == str2.intern())); // True

        // Create two String objects with different cases
        String firstName = "Shubhadeep Naskar";
        String firstName1 = "shubhadeep naskar";
        // Check if firstName is equal to firstName1
        System.out.println("firstName.equals(firstName1) : " + firstName.equals(firstName1)); // False
        // Check if firstName is equal to firstName1, ignoring case
        System.out.println("firstName.equalsIgnoreCase(firstName1) : " + firstName.equalsIgnoreCase(firstName1)); // True
        // Compare firstName to firstName1 lexicographically
        System.out.println("firstName.compareTo(firstName1) : " + firstName.compareTo(firstName1)); // 32
        // Compare firstName to firstName1 lexicographically, ignoring case
        System.out.println("firstName.compareToIgnoreCase(firstName1) : " + firstName.compareToIgnoreCase(firstName1)); // 0
    }
}