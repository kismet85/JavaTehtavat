import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        if (isValidBinary(binaryInput)) {
            int decimalResult = binaryToDecimal(binaryInput);
            System.out.println("Decimal equivalent: " + decimalResult);
        } else {
            System.out.println("Invalid binary input. Please enter a binary number (composed of 0s and 1s).");
        }

        scanner.close();
    }

    private static boolean isValidBinary(String binary) {
        return binary.matches("[01]+");
    }
    private static int binaryToDecimal(String binary) {
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {

            char bit = binary.charAt(i);

            int bitValue = Character.getNumericValue(bit);

            decimal += (int) (bitValue * Math.pow(2, binary.length() - i - 1));
        }

        return decimal;
    }
}




