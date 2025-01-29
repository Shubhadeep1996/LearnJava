package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.RegularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpressions {
    public static void main(String[] args) {
        // Regular Expressions in Java

        /*
         * Regular Expressions (Regex) in Java:
         *
         * 1. Basic Syntax:
         *    - `.`: Matches any character except newline.
         *    - `^`: Matches the beginning of a line.
         *    - `$`: Matches the end of a line.
         *    - `*`: Matches 0 or more occurrences of the preceding element.
         *    - `+`: Matches 1 or more occurrences of the preceding element.
         *    - `?`: Matches 0 or 1 occurrence of the preceding element.
         *    - `[]`: Matches any one of the characters inside the brackets.
         *    - `[^]`: Matches any character not inside the brackets.
         *    - `|`: Matches either the pattern before or the pattern after the `|`.
         *    - `()`: Groups patterns together.
         *    - `\`: Escapes a special character.
         *
         * 2. Predefined Character Classes:
         *    - `\d`: Matches any digit (equivalent to `[0-9]`).
         *    - `\D`: Matches any non-digit.
         *    - `\w`: Matches any word character (alphanumeric + underscore).
         *    - `\W`: Matches any non-word character.
         *    - `\s`: Matches any whitespace character.
         *    - `\S`: Matches any non-whitespace character.
         *
         * 3. Quantifiers:
         *    - `{n}`: Matches exactly n occurrences.
         *    - `{n,}`: Matches n or more occurrences.
         *    - `{n,m}`: Matches between n and m occurrences.
         *
         * 4. Boundary Matchers:
         *    - `\b`: Matches a word boundary.
         *    - `\B`: Matches a non-word boundary.
         *
         * 5. Examples:
         *    - `<h1>My Heading</h1>`: Matches an HTML heading tag.
         *    - `<p>This is a paragraph.</p>`: Matches an HTML paragraph tag.
         *
         * 6. Example with Gmail Pattern:
         *    - `String gmailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";`
         *    - `Pattern pattern = Pattern.compile(gmailPattern);`
         *    - `String sampleText = "test@gmail.com";`
         *    - `Matcher matcher = pattern.matcher(sampleText);`
         *    - `boolean found = matcher.find();`
         *    - `String group = matcher.group();`
         *    - `String matcherString = matcher.toString();`
         */

        String str = "I am a string. Yes, I am.";
        System.out.println(str);
        String yourString = str.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y")); // Matches any character
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")); // Matches beginning of the string

        System.out.println(alphanumeric.matches("^hello")); // Matches the entire string
        System.out.println(alphanumeric.matches("^abcDeee")); // Matches the entire string
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z")); // Matches the entire string

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END")); // Matches end of the string
        System.out.println(alphanumeric.replaceAll("[aei]", "X")); // Matches any 'a', 'e', or 'i'
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")); // Matches 'a', 'e', or 'i' followed by 'F' or 'j'

        System.out.println("harry".replaceAll("[Hh]arry", "Harry")); // Matches 'Harry' or 'harry'

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X")); // Matches any character except 'e' or 'j'
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X")); // Matches any character in the set
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X")); // Matches any character in the range
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // Case-insensitive match
        System.out.println(newAlphanumeric.replaceAll("\\d", "X")); // Matches any digit
        System.out.println(newAlphanumeric.replaceAll("\\D", "X")); // Matches any non-digit

        String hasWhiteSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", "")); // Matches any whitespace
        System.out.println(hasWhiteSpace.replaceAll("\t", "X")); // Matches tab
        System.out.println(hasWhiteSpace.replaceAll("\\S", "")); // Matches any non-whitespace
        System.out.println(newAlphanumeric.replaceAll("\\w", "X")); // Matches any word character
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X")); // Matches any word character
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X")); // Matches word boundary

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY")); // Matches 'abcDe' followed by exactly 3 'e'
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY")); // Matches 'abcDe' followed by 1 or more 'e'
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY")); // Matches 'abcD' followed by 0 or more 'e'
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY")); // Matches 'abcDe' followed by 2 to 5 'e'
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y")); // Matches 'h' followed by 1 or more 'i' followed by 0 or more 'j'
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y")); // Matches 'h' followed by 1 or more 'i' followed by 0 or more 'j'
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y")); // Matches 'h' followed by 1 or more 'i' followed by 0 or more 'j'

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>"); // Create a StringBuilder to build HTML content
        htmlText.append("<h2>Sub-heading</h2>"); // Append a sub-heading to the HTML content
        htmlText.append("<p>This is a paragraph about something.</p>"); // Append a paragraph to the HTML content
        htmlText.append("<p>This is another paragraph about something else.</p>"); // Append another paragraph to the HTML content
        htmlText.append("<h2>Summary</h2>"); // Append another sub-heading to the HTML content
        htmlText.append("<p>Here is the summary.</p>"); // Append a summary paragraph to the HTML content

        // Define a regex pattern to match Gmail addresses
        String gmailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

        // Compile the regex pattern into a Pattern object
        Pattern pattern = Pattern.compile(gmailPattern);

        // Sample text containing an email address
        String sampleText = "For any inquiries or bookings related to our bird watching tours, please contact us at contact@birdwatching.com. We are here to assist you with all your bird watching needs.";

        // Create a Matcher object to find matches of the pattern in the sample text
        Matcher matcher = pattern.matcher(sampleText);

        // Loop through all matches found in the sample text
        while (matcher.find()) {
            // Get the matched Gmail address
            String gmainAddress = matcher.group();
            // Print the matched Gmail address
            System.out.println(gmainAddress);
        }

        // Another sample text to demonstrate splitting sentences
        String sampleText2 = "For more information, please contact us at info@example.com or call us at (123) 456-7890.";

        // Split the sample text into sentences based on punctuation marks (., !, ?)
        String[] sentences = sampleText2.split("[\\.!?]");

        // Print the array of sentences
        System.out.println(Arrays.toString(sentences));
    }
}
