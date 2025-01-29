package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExercisePINumberFormatting;

public class pinumberformattingex {
    public static void main(String[] args) {
        System.out.printf("Pi Value to one fraction: %.1f", Math.PI);
        System.out.printf("Pi Value to one fraction: %.2f", Math.PI);
        System.out.printf("Pi Value to one fraction: %.3f", Math.PI);
        System.out.printf("Pi Value to one fraction: %.4f", Math.PI);
        System.out.printf("Pi Value to one fraction: %.5f", Math.PI);

        System.out.printf("%.1f,%.2f,%.3f,%.4f,%.5f", Math.PI, Math.PI, Math.PI, Math.PI, Math.PI);
    }
}
