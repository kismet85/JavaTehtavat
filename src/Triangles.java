import java.util.Scanner;

public class Triangles {

    public static double pythagoras(double firstLeg, double secondLeg)
    {
        double hypotenuse = Math.pow(firstLeg,2) + Math.pow(secondLeg,2);
        return Math.sqrt(hypotenuse);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first leg of a right triangle:");
        double firstLeg = scanner.nextDouble();

        System.out.println("Enter the second leg of a right triangle:");
        double secondLeg = scanner.nextDouble();

        double pythagorasCalculation = pythagoras(firstLeg,secondLeg);
        System.out.printf("The hypotenuse of the legs is: %.3f", pythagorasCalculation);
    }
}
