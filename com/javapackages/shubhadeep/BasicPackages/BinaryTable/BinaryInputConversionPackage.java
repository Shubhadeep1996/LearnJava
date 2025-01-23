package com.javapackages.shubhadeep.BasicPackages.BinaryTable;
import java.util.Scanner;

public class BinaryInputConversionPackage {
    public void convertUserInputToBinary(int number) {
        //Remove the comment to take input from the user
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a decimal number: ");
        //int number = scanner.nextInt();
        System.out.println("Binary value: " + Integer.toBinaryString(number));
    }
}


