package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.ForEachLoops;

public class foreachloops {
    public static void main(String[] args) {

        //For each loop is used to iterate over elements of an array or a collection.
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        //For each loop using String array
        String[] names = {"Shubhadeep", "Chaitali", "Nirmalya", "Lakshmi Kanta", "Santanu", "Mousumi", "Pradip"};
        for (String name : names) {
            System.out.println(name);
        }

        //For each loop using char array
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            System.out.println(vowel);
        }

        //For each loop using For each loop using 2D array
        int[][] numbers2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : numbers2D) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        //For each loop using collection
        java.util.List<Integer> numbersList = new java.util.ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        for (int number : numbersList) {
            System.out.println(number);
        }
    }
}
