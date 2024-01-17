import java.util.Locale;
import java.util.Scanner;

public class ObseleteMeasures {

    public static void main(String[] args) {
        double luotiPerGramma = 13.28;
        double naulaPerGramma = luotiPerGramma*32;
        double leiviskaPerGramma = naulaPerGramma*20;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g):");
        double weight = scanner.nextDouble();

        double leiviskaResult = (int)weight / leiviskaPerGramma;
        double leiviskat = Math.floor(leiviskaResult);
        double leiviskaRemainder = (leiviskaResult - leiviskat) * leiviskaPerGramma;
        double naulatResult = leiviskaRemainder / naulaPerGramma;
        double naulat = Math.floor(naulatResult);
        double naulatRemainder = (naulatResult - naulat) * naulaPerGramma;
        double luotiResult = naulatRemainder / luotiPerGramma;

        System.out.printf((int)weight + " grams is " + (int)leiviskat + " Leiviskä, " + (int)naulat + " naula, " + String.format(Locale.US, "%.2f", luotiResult) + " luoti.");

    }
}


