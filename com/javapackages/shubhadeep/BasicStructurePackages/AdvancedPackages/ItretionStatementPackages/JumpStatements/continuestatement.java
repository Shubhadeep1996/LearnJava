package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.JumpStatements;

public class continuestatement {
    public static void main(String[] args) {

        // Continue statement is used to skip the current iteration of the loop and continue with the next iteration.
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        //Continue statement using while loop 2D array
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (i == j) {
                    i++;
                    continue;
                }
                sum += arr[i][j];
                j++;
            }
            i++;
        }
    }
}
