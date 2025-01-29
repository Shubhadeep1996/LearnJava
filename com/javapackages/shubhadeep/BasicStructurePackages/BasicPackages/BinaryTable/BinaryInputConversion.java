package com.javapackages.shubhadeep.BasicStructurePackages.BasicPackages.BinaryTable;
import java.util.Scanner;

public class BinaryInputConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum length for binary representation(e.g. 3 will show till 7, 4 will show till 15): ");
        int maxLength = scanner.nextInt();
        for (int i = 0; i <= (1 << maxLength) - 1; i++) {
            String binaryString = String.format("%" + maxLength + "s", Integer.toBinaryString(i)).replace(' ', '0');
            System.out.println(i + "\t" + binaryString);
        }
    }
}
