import java.util.Scanner;

public class FahrenheitToCelsius {
    public static double convert(double fahrenheit) {
        final double CONVERSION_TO_CELSIUS = ((double) 5 /9) * (fahrenheit -32);
        return CONVERSION_TO_CELSIUS;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fahrenheit temperature: ");
        double fahrenheitTemp = scanner.nextDouble();
        double celsius = convert(fahrenheitTemp);
        System.out.printf("The temperature from fahrenheit to celsius is: %.1f", celsius);
        System.out.print(" °C");
    }
}
