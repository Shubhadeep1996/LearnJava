package com.javapackages.shubhadeep.BasicStructurePackages.BasicPackages.BinaryTable;

public class BinaryConversion {
    public static void main(String[] args) {
        System.out.println("Decimal\tBinary");
        for (int i = 0; i <= 15; i++) {
            //System.out.println(i + "\t" + Integer.toBinaryString(i));
            System.out.println(i + "\t" + String.format("%" + Integer.toBinaryString(15).length() + "s", Integer.toBinaryString(i)).replace(' ', '0'));
        }
    }
}
