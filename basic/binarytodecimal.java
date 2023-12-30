import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        int reversedBinary = reverseBinary(decimalToBinary(decimalNumber));

        System.out.println("Reversed binary as integer: " + reversedBinary);
        scanner.close();
    }

    private static int decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return 0;
        }

        int binary = 0;
        int base = 1;

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary = remainder * base + binary;
            decimalNumber /= 2;
            base *= 10;
        }

        return binary;
    }

    private static int reverseBinary(int binary) {
        int reversedBinary = 0;

        while (binary > 0) {
            int digit = binary % 10;
            reversedBinary = reversedBinary * 10 + digit;
            binary /= 10;
        }

        return reversedBinary;
    }
}
