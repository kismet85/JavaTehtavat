import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number for prime number calculations:");
        int start = scanner.nextInt();

        System.out.println("Enter the end number for prime number calculations:");
        int end = scanner.nextInt();

        primeNumberCalculations(start,end);

    }

    public static void primeNumberCalculations(int start, int end)
    {
        if(start < 2)
        {
            start = 2;
        }
        for (int i = start; i < end; i++) {
            primeNumberReturns(i);
        }

    }

    public static void primeNumberReturns(int number)
    {
        
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number);
    }
}
