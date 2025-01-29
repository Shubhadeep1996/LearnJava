package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.PosixCharacterPackages;

public class posixcharexpressions {
    public static void main(String[] args) {
        System.out.println("POSIX Character Classes are used to match the characters based on the POSIX standard. For example:");
        System.out.println("POSIX Character Classes are used to match the characters based on the POSIX standard. Here are some examples:");
        System.out.println("Example: Matching any digit using POSIX character class:");
        String exampleText = "abc123XYZ";
        System.out.println(exampleText.replaceAll("[[:digit:]]", "X")); // Replaces digits with 'X'
        System.out.println("Example: Matching any alphanumeric character using POSIX character class:");
        System.out.println(exampleText.replaceAll("[[:alnum:]]", "X")); // Replaces alphanumeric characters with 'X'
        System.out.println("Example: Matching any control character using POSIX character class:");
        String controlText = "Hello\nWorld\t!";
        System.out.println(controlText.replaceAll("[[:cntrl:]]", "X")); // Replaces control characters with 'X'

        /*
         * POSIX Character Classes:
         *
         * 1. [:alnum:] - Matches any alphanumeric character (a-z, A-Z, 0-9).
         * 2. [:alpha:] - Matches any alphabetic character (a-z, A-Z).
         * 3. [:blank:] - Matches a space or a tab.
         * 4. [:cntrl:] - Matches any control character.
         * 5. [:digit:] - Matches any digit (0-9).
         * 6. [:graph:] - Matches any visible character (excluding spaces).
         * 7. [:lower:] - Matches any lowercase letter (a-z).
         * 8. [:print:] - Matches any printable character (including spaces).
         * 9. [:punct:] - Matches any punctuation character.
         * 10. [:space:] - Matches any whitespace character (spaces, tabs, newlines).
         * 11. [:upper:] - Matches any uppercase letter (A-Z).
         * 12. [:xdigit:] - Matches any hexadecimal digit (0-9, a-f, A-F).
         *
         * Usage:
         * POSIX character classes are used within regular expressions to match specific types of characters.
         * For example, to match any digit, you can use the pattern "[[:digit:]]".
         */
    }
}

