package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExercseItrationStatements;

import java.util.Scanner;

public class matrixprint2ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            matrix[i] = new int[cols];
            System.out.println("Enter the elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}