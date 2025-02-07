package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.NestedLoops;

public class nestedloop {
    public static void main(String[] args) {

        // Nested Loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
            Nested Loop using while loop, do-while loop, for loop, for-each loop, etc.
        */

        // Nested Loop using while loop
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        // Nested Loop using do-while loop
        i = 1;
        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);

        // Nested Loop using for-each loop
        int[][] numbers2D = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}};
        for (int[] row : numbers2D) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        // Nested Loop using for loop
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Nested Loop using while and do while loop
        i = 1;
        while (i <= 5) {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        }
    }
}
