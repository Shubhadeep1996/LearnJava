package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.ForLoops;

public class forloop {
    public static void main(String[] args) {

        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is: " + i);
        }

        // For loop with multiple statements
        for (int i = 0, j = 10; i < 10; i++, j--) {
            System.out.println("The value of i is: " + i + " and the value of j is: " + j);
        }

        /*
        // For loop with while loop, Do-While loop and Control Statements
        */
        int[] scores = {85, 90, 78, 92, 88, 55, 40, 30, 95, 60};

        // For loop to print all scores
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        // While loop to check for failing scores
        int index = 0;
        while (index < scores.length) {
            if (scores[index] < 40) {
                System.out.println("Failing score found: " + scores[index]);
                break;
            }
            index++;
        }

        // Do-While loop to verify passing scores
        int a = 0;
        do {
            if (scores[a] >= 40) {
                System.out.println("Passing score: " + scores[a]);
            }
            a++;
        } while (a < scores.length);

        // For loop with control statements to count passing and failing scores
        int passingCount = 0;
        int failingCount = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 40) {
                passingCount++;
            } else {
                failingCount++;
            }
        }
        System.out.println("Total passing scores: " + passingCount);
        System.out.println("Total failing scores: " + failingCount);
    }
}
