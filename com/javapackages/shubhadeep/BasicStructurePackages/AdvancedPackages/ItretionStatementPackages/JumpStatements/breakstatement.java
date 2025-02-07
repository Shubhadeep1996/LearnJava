package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.JumpStatements;

public class breakstatement {
    public static void main(String[] args) {

        // break statement is used to terminate the loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // break statement using switch case
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
