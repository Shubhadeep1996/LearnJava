package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExerciseSplitWords;

import java.util.Arrays;
import java.util.Scanner;

public class splitwordsex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        String[] words = userInput.split("\\W+");
        System.out.print("You entered these words: ");
        System.out.println(Arrays.toString(words));
    }
}
