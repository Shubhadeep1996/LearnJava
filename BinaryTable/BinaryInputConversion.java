package BinaryTable;
import java.util.Scanner;

public class BinaryInputConversion {
    public void convertUserInputToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();
        System.out.println("Binary value: " + Integer.toBinaryString(number));
    }
}

