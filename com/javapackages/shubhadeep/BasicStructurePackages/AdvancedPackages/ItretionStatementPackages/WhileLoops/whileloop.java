package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.WhileLoops;

public class whileloop {
    public static void main(String[] args) {
        //Basic while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //Infinite while loop
//        while (true) {
//            System.out.println("Infinite while loop");
//        }

        //While loop with break statement
        int count = 0;
        while (count < 10) {
            if (count == 5) {
                break;
            }
            System.out.println("Count is: " + count);
            count++;
        }

        // Result checking with break statement
        int[] scores = {85, 90, 78, 92, 88};
        int index = 0;
        while (index < scores.length) {
            if (scores[index] < 40) {
                System.out.println("Failing score found: " + scores[index]);
                break;
            }
            System.out.println("Score is: " + scores[index]);
            index++;
        }

        //While loop with continue statement
        int j = 0;
        while (j < 5) {
            if (j == 2) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }

        // Age verification with continue statement
        int[] age = {12, 17, 19, 15, 21};
        int a = 0;
        while (a < age.length) {
            if (age[a] < 18) {
                a++;
                continue;
            }
            System.out.println("Verified age: " + age[a]);
            a++;
        }
    }
}
