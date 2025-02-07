package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ItretionStatementPackages.DoWhileLoops;

public class dowhileloop {
    public static void main(String[] args) {

        // Do-While loop
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // Age verification using do-while loop
        int[] age = {12, 17, 19, 15, 21};
        int a = 0;
        do {
            if (age[a] < 18) {
                a++;
                continue;
            }
            System.out.println("Verified age: " + age[a]);
            a++;
        } while (a < age.length);
    }
}
