package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.Labels;

public class labels {
    public static void main(String[] args) {

        //Labels are used to break out of nested loops.
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    break outer;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }

        //Lables usiing continue statement
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
